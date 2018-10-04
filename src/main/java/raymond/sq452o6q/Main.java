package raymond.sq452o6q;

import java.sql.*;
import java.util.*;
import java.io.*; 

public class Main {
	Connection oracleConn=null,sqlsvConn=null;
	String[] extractedTb=new String[500];//non-empty table names
	String[] pkTb=new String[500];
	int tableNum;//non-empty table #
	static HashSet<String> dType=new HashSet<String>();//precise data type in o6q 
	static HashMap<String,String> dMap=new HashMap<String,String>();//data type transformation table
	String file;
	File writeName;
	BufferedWriter out;
	//Create a new file to log info
	public void logCreate(String file) throws IOException {
		writeName=new File(file);
		writeName.createNewFile();
		out=new BufferedWriter(new FileWriter(writeName,true));
	}
	//Data Type In O6q needs length def.
	static public void dataSpec() {
		dType.add("");
		//CHAR
		dType.add("NVARCHAR");	dType.add("VARCHAR");	dType.add("CHAR");
		//NUMBER
		dType.add("NUMERIC");	dType.add("NUMERIC IDENTITY");	dType.add("DECIMAL");	dType.add("DECIMAL IDENTITY");
		//RAW
		//		dType.add("TIMESTAMP");	
		dType.add("VARBINARY");	dType.add("BINARY");	dType.add("IMAGE");
	}
	//Transform Map
	static public void dataMap() {
		dMap.put("BIGINT", "NUMBER(19)"); dMap.put("BIGINT IDENTITY", "NUMBER(19)"); dMap.put("BINARY", "RAW");
		dMap.put("BIT", "CHAR(5)"); dMap.put("CHAR", "CHAR");  dMap.put("DATETIME", "VARCHAR2(255)");
		dMap.put("DECIMAL","NUMBER"); dMap.put("DECIMAL IDENTITY", "NUMBER"); dMap.put("FLOAT", "FLOAT(53)");
		dMap.put("IMAGE", "BLOB"); dMap.put("INT", "NUMBER(10)"); dMap.put("INT IDENTITY", "NUMBER(10)");
		dMap.put("MONEY", "NUMBER(19,4)"); dMap.put("NCHAR", "NCHAR"); dMap.put("NTEXT", "NCLOB");
		dMap.put("NVARCHAR", "NVARCHAR"); dMap.put("NUMERIC", "NUMBER"); dMap.put("NUMERIC IDENTITY", "NUMBER");
		dMap.put("REAL", "FLOAT(24)"); dMap.put("SMALLDATETIME", "DATE"); dMap.put("SMALLMONEY", "NUMBER(10,4)");
		dMap.put("SMALLINT", "NUMBER(5)"); dMap.put("SMALLINT IDENTITY", "NUMBER(5)"); dMap.put("SYSNAME", "NVARCHAR");
		dMap.put("TEXT", "CLOB");  dMap.put("TINYINT", "NUMBER(3)"); dMap.put("TIMESTAMP", "VARCHAR2(255)");
		dMap.put("TINYINT IDENTITY", "NUMBER(3)"); dMap.put("VARBINARY", "RAW"); dMap.put("VARCHAR", "VARCHAR2");
		dMap.put("XML", "CLOB"); dMap.put("", "");
	}
	//DB Connect
	public Connection dbCon(String driverName, String dbURL, String Name, String Pwd) {
		Connection conn=null;
		try{
			Class.forName(driverName);
			conn=DriverManager.getConnection(dbURL,Name,Pwd);
			System.out.println("Connection Successful");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Connection Failed");
		}
		return conn;
	}
	//DB Extract Table Names
	public int tbExtract(Statement stmt) throws SQLException {
		int total=0,item=0,t=0;
		int i=0,j=0;
		ResultSet rs;
		String[] AllTb=new String[500];
		try {
			rs = stmt.executeQuery("SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA='dbo' AND TABLE_TYPE='BASE TABLE' ORDER BY TABLE_NAME");//Extract all table names from sqlsv
			//rs = stmt.executeQuery("SELECT TABLE_NAME FROM INFORMATION_SCHEMA.VIEWS WHERE TABLE_SCHEMA='dbo' AND TABLE_NAME='query_functionallrooms' ORDER BY TABLE_NAME");//Extract view names
			while (rs.next())
				AllTb[total++]=rs.getString(1);
			while ( item!=total) {
				rs=stmt.executeQuery("SELECT count(*) as sum from "+AllTb[item]);//Extract tables with items>0
				if (rs.next()) {
					if (rs.getInt("sum")>0) {
						extractedTb[j++]=AllTb[item];
					}
				}
				item++;
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Execution Failed");
		}
		//		For Test
		//				System.out.println("All Table:"+(total-1));
		//				System.out.println("Extracted Table:"+(j-1));
		//				for (i=0;i<j;i++)
		//					System.out.println(extractedTb[i]);
		return j-1;
	}
	//DB Extract Data Content,Data Type,Data Type Length
	public void dataExtract(Statement stmt,Statement stmt2,int id) throws SQLException, IOException {
		//Initialize
		ResultSetMetaData md;
		String sName,sData,sType,sLen,sNameType,sNameCopy,sScale,sPk;
		sName=sData=sType=sLen=sNameType=sNameCopy=sScale=sPk="";
		int colNum,rowNum;
		//Get Data from sql
		ResultSet rs=stmt.executeQuery("select * from "+extractedTb[id]);
		md=rs.getMetaData();
		colNum=md.getColumnCount();
		//Get Data Type,Data Type Length,Field Name
		for (int j=1;j<=colNum;j++) {
			sNameCopy=md.getColumnName(j);
			sName+=sNameCopy+",";
			sType=md.getColumnTypeName(j);
			sLen=md.getPrecision(j)+"";
			sScale=md.getScale(j)+"";
			//data transform from sq45 to o6q
			sNameType+=dbTrans(sType,sLen,sNameCopy,sScale);
			if (j==1){
				sNameType=sNameType.substring(0,sNameType.length()-1);
				sNameType+=" "+"NOT NULL"+",";
				sPk=sNameCopy;
				pkTb[id]=sPk;
			}
		}
		sNameType=sNameType.substring(0,sNameType.length()-1);
		sName=sName.substring(0,sName.length()-1);
		//db create
		dbCreate(sNameType,stmt2,id,sPk);
		loadLog(extractedTb[id]+" created successfully");
		//Test
		//		if (extractedTb[id].equals("custt")) {
		//		if (id<5) {
		//			System.out.println(extractedTb[id]);
		//			System.out.println(sNameType);
		//			dbCreate(sNameType,stmt2,id);
		//			loadLog(extractedTb[id]+" created successfully");
		//		}
		//Get Data Contents
		int pos,npos,veryLong; 
		String str1,str2,declare;
		str1=str2="";
		while (rs.next()) {
			declare="";
			veryLong=0;
			for (int j=1;j<=colNum;j++) {
				String tmp=rs.getObject(j)+"";
				//Handle Field which has the char ',such as Jack's house
				npos=pos=0;
				while (npos!=-1) {
					npos=tmp.indexOf("'",pos);
					if (npos==-1)
						break;
					str1=tmp.substring(0,npos+1);
					str2=tmp.substring(npos+1);
					tmp=str1+"'"+str2;
					pos=npos+2;
				}
				//HANDLE VERY LONG STRING
				if (tmp.length()>=4000) {
					veryLong++;
					declare+="cnt"+veryLong+" clob:='"+tmp+"';";
					sData+="cnt"+veryLong+",";
				}else {
					if (!tmp.equals("null"))
						sData+="'"+tmp+"'"+",";
					else
						sData+="''"+",";
				}
			}
			sData=sData.substring(0,sData.length()-1);
			//data load
			//			if (id<5) {
			//			System.out.println("declare="+declare);
			//			System.out.println("sData="+sData);
			dbLoad(sName,sData,stmt2,id,declare);
			loadLog(rs.getRow()+" row(s) created");
			//			}
			sData="";
		}
		//		if (id<5) {
		loadLog(extractedTb[id]+ " load finished");
		loadLog("---------------------------------------------------------------------------------------------------------------------------------------------------");
		//		}
	}
	//data type trans between different database
	public String dbTrans(String sType,String sLen,String sName,String sScale) {
		String res,par;
		res=par="";
		sType=sType.toUpperCase();
		if (dMap.containsKey(sType))
			par=dMap.get(sType);
		else 
			System.out.println("miss!");
		if (dType.contains(sType)) {
			if (sType.charAt(0)=='N' || sType.charAt(0)=='D')
				par+='('+sLen+','+sScale+')';
			else {
				if (Integer.parseInt(sLen)>=4000)
					par="CLOB";
				else
					par+='('+sLen+')';
			}
		}
		res+=sName+" "+par+",";
		return res;
	}
	//db Create
	public void dbCreate(String sNameType,Statement stmt2,int id,String sPk) throws SQLException {
		ResultSet rs,rs2;
		rs=stmt2.executeQuery("CREATE TABLE RAYMOND."+extractedTb[id]+"("+sNameType+")");
		rs2=stmt2.executeQuery("ALTER TABLE RAYMOND."+extractedTb[id]+" ADD (CONSTRAINT "+extractedTb[id]+"_pk PRIMARY KEY ("+sPk+"))");
		//rs=stmt2.executeQuery("CREATE VIEW RAYMOND."+extractedTb[id]+"("+sNameType+")");
	}
	//db Load
	public void dbLoad(String sName,String sData,Statement stmt2,int id,String declare) throws SQLException {
		ResultSet rs;
		//		System.out.println(sData);
		if (declare.equals(""))
			rs=stmt2.executeQuery("INSERT INTO RAYMOND."+extractedTb[id]+"("+sName+")" + "VALUES("+sData+")");
		else
			rs=stmt2.executeQuery("declare "+declare+"begin "+"INSERT INTO RAYMOND."+extractedTb[id]+"("+sName+")" + "VALUES("+sData+");"+"end;");
	}
	//information record
	public void loadLog(String info) throws IOException {
		out.write(info+"\r\n");
		out.flush();
	}
	//modify
	public void modify(Statement stmt,Statement stmt2,int id) throws SQLException {
		//Initialize
		ResultSetMetaData md;
		String sType,sName;
		sType=sName="";
		int colNum=0;
		//Get Data from sql
		ResultSet rs=stmt.executeQuery("select * from "+extractedTb[id]);
		md=rs.getMetaData();
		colNum=md.getColumnCount();
		//datatime->date
		for (int j=1;j<=colNum;j++) {
			sType=md.getColumnTypeName(j);
			sName=md.getColumnName(j);
			if (sType.equals("datetime")) {
				System.out.println(sName);
				ResultSet rs2=stmt2.executeQuery("ALTER TABLE RAYMOND."+extractedTb[id]+" add("+sName+"2"+" date)");
				rs2=stmt2.executeQuery("UPDATE RAYMOND."+extractedTb[id]+" SET "+sName+"2=CAST(to_date(SUBSTR("+sName+",0,19),'YYYY-MM-DD HH24:MI:SS') AS DATE)");
			}
		}
	}
	//delete
	public void del(Statement stmt,Statement stmt2,int id) throws SQLException {
		//Initialize
		ResultSetMetaData md;
		String sType,sName;
		sType=sName="";
		int colNum=0;
		//Get Data from sql
		ResultSet rs=stmt.executeQuery("select * from "+extractedTb[id]);
		md=rs.getMetaData();
		colNum=md.getColumnCount();
		//
		for (int j=1;j<=colNum;j++) {
			sType=md.getColumnTypeName(j);
			sName=md.getColumnName(j);
			if (sType.equals("datetime")) {
				System.out.println(sName);
				ResultSet rs2=stmt2.executeQuery("ALTER TABLE RAYMOND."+extractedTb[id]+" drop column "+sName);
			}
		}
	}
	//modify2
	public void modify2(Statement stmt,Statement stmt2,int id) throws SQLException {
		//Initialize
		ResultSetMetaData md;
		String sType,sName;
		sType=sName="";
		int colNum=0;
		//Get Data from sql
		ResultSet rs=stmt.executeQuery("select * from "+extractedTb[id]);
		md=rs.getMetaData();
		colNum=md.getColumnCount();
		//datatime->date
		for (int j=1;j<=colNum;j++) {
			sType=md.getColumnTypeName(j);
			sName=md.getColumnName(j);
			if (sType.equals("bit")) {
				System.out.println(sName);
				ResultSet rs2=stmt2.executeQuery("UPDATE RAYMOND."+extractedTb[id]+" SET "+sName+"=REPLACE("+sName+",'false',0)");
				rs2=stmt2.executeQuery("UPDATE RAYMOND."+extractedTb[id]+" SET "+sName+"=REPLACE("+sName+",'true',1)");
			}
		}
	}
	//Add Seq
	public void addSeq(Statement stmt2,int id) throws SQLException {
		// ResultSet rs=stmt2.executeQuery("ALTER TABLE RAYMOND."+extractedTb[id]+" ADD (ID NUMBER(11) GENERATED BY DEFAULT ON NULL AS IDENTITY)");
		ResultSet rs0=stmt2.executeQuery("SELECT MAX("+pkTb[id]+") FROM "+extractedTb[id]);
		String mx=rs0.getObject(1)+"";
		int intmx=Integer.parseInt(mx);
		intmx++;
		String start=""+intmx;
		ResultSet rs=stmt2.executeQuery("CREATE SEQUENCE "+extractedTb[id]+"_sequence\r\n"+
 										"START WITH "+start+"\r\n"+
 										"NOCACHE\r\n"+
 										"NOCYCLE;");
		ResultSet rs2=stmt2.executeQuery("CREATE OR REPLACE TRIGGER "+extractedTb[id]+"_on_insert\r\n"+
  										 "BEFORE INSERT ON "+"extractedTb[id]\r\n"+
  									     "FOR EACH ROW\r\n"+
										 "BEGIN\r\n"+
  										 "SELECT  "+extractedTb[id]+"_sequence.nextval\r\n"+
  										 "INTO :new.id\r\n"+
  										 "FROM dual;\r\n"+
										 "END;");
	}
	//Add Trigger
	public void addTrigger(Statement stmt2,int id) throws SQLException {
		ResultSet rs=stmt2.executeQuery("CREATE OR replace TRIGGER\r\n" + 
										"tr_"+extractedTb[id]+" BEFORE UPDATE ON raymond."+extractedTb[id]+"\r\n" + 
										"FOR EACH ROW\r\n" + 
										"BEGIN\r\n" + 
										"IF (:old.ver!=:new.ver) THEN\r\n" + 
										"	raise_application_error(-20002,'failed');\r\n" + 
										"ELSE\r\n" + 
										"	:new.ver:=seq.nextval;\r\n" + 
										"	:new.modifiedby_whom:=user;\r\n" +
										"	:new.modified_date:=sysdate;\r\n" + 
										"END IF;\r\n" + 
										"END;");
	}
	//Add New Columns
	public void addCol(Statement stmt2,int id) throws SQLException {
		ResultSet rs=stmt2.executeQuery("ALTER TABLE raymond."+extractedTb[id]+"\r\n"+ 
										"ADD Modified_Date Date");
		rs=stmt2.executeQuery("ALTER TABLE raymond."+extractedTb[id]+"\r\n"+ 
							  "ADD ModifiedBy_Whom VARCHAR2(255)");
		rs=stmt2.executeQuery("ALTER TABLE raymond."+extractedTb[id]+"\r\n"+ 
				  			  "ADD VER NUMBER(11)");
	}
	
	public static void main(String[] args) throws SQLException, IOException {
		Main ETL=new Main();
		Main a=new Main();
		String driverName="oracle.jdbc.OracleDriver";//SQL Engine
		String dbURL="jdbc:oracle:thin:@//128.206.190.72:1521/projex4.projex4db.cf.missouri.edu";//Data Source	           
		String Name="raymond", Pwd="Camgyc58";
		String driverName2="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL2="jdbc:sqlserver://128.206.242.112:1433;databaseName=esp2000;integratedSecurity=true";
		String Name2="", Pwd2="";
		String file="log.txt";
		//Create a new log file
		ETL.logCreate(file);
		//Data Type Enter
		dataSpec();
		//Transform Map
		dataMap();
		//DB Connect
		ETL.oracleConn=ETL.dbCon(driverName,dbURL,Name,Pwd);
		ETL.sqlsvConn=ETL.dbCon(driverName2,dbURL2,Name2,Pwd2);
		Statement stmt = ETL.sqlsvConn.createStatement();
		Statement stmt2= ETL.oracleConn.createStatement();
		//DB Extract1
		ETL.tableNum=ETL.tbExtract(stmt);
		//Refresh Delete all tables
				try{
				for (int i=0;i<=ETL.tableNum;i++) {
					String tmp=ETL.extractedTb[i].toUpperCase();
					stmt2.executeQuery("DROP TABLE RAYMOND."+tmp);
				}
				}catch(Exception e){
				}
		//DB Extract2 
		for (int i=0;i<=ETL.tableNum;i++) {
			System.out.println(i+" table(s) transformed "+ETL.extractedTb[i]);
			ETL.dataExtract(stmt,stmt2,i);
		}
		//Modify
		for (int i=0;i<=ETL.tableNum;i++) {
			System.out.println(i+" table(s) modified "+ETL.extractedTb[i]);
			ETL.modify(stmt,stmt2,i);
		}
		//Delete Surplus
		for (int i=0;i<=ETL.tableNum;i++) {
				System.out.println(i+" table(s) deleted "+ETL.extractedTb[i]);
				ETL.del(stmt,stmt2,i);
			}
		//Modify
		for (int i=0;i<=ETL.tableNum;i++) {
			System.out.println(i+" table(s) modified "+ETL.extractedTb[i]);
			ETL.modify2(stmt,stmt2,i);
		}
		//Add Sequence
		for (int i=0;i<=ETL.tableNum;i++) {
			System.out.println(i+" table(s) add sequence "+ETL.extractedTb[i]);
			ETL.addSeq(stmt2,i);
		}
		//Add Trigger
		// for (int i=0;i<=ETL.tableNum;i++) {
		// 	System.out.println(i+" table(s) add trigger "+ETL.extractedTb[i]);
		// 	ETL.addTrigger(stmt2,i);
		// }
		//Add New Columns: Modified_Date, ModifiedBy_Whom, Version
		for (int i=0;i<=ETL.tableNum;i++) {
			System.out.println(i+" table(s) add new columns "+ETL.extractedTb[i]);
			ETL.addCol(stmt2,i);
		}
		
		stmt.close();
		stmt2.close();
	}
}
