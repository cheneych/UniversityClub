package raymond.data;

import java.math.BigDecimal;
import java.math.BigInteger;

@SuppressWarnings("serial")
public class OracleDecimal extends BigDecimal {
	
	public static OracleDecimal ZERO = new OracleDecimal(BigDecimal.ZERO);
	public static OracleDecimal ONE = new OracleDecimal(BigDecimal.ONE);
	
	public OracleDecimal(char[] in) {
		super(in);
	}

	public OracleDecimal(String val) {
		super(val != null ? val.replace("$","").replace("%", "").replace(",","") : "0");
	}

	public OracleDecimal(double val) {
		super(Double.toString(val));
	}

	public OracleDecimal(BigInteger val) {
		super(val);
	}
	
	public OracleDecimal(BigDecimal val) {
		super(val.toPlainString());
	}
	
	public OracleDecimal(OracleDecimal val) {
		super(val.toPlainString());
	}
	
	public OracleDecimal(Double val) {
		super(val.toString());
	}

	public OracleDecimal(int val) {
		super(val);
	}

	public OracleDecimal(long val) {
		super(val);
	}
	
	public static OracleDecimal valueOf(String val) {
		return new OracleDecimal(val);
	}
	
	public static OracleDecimal valueOf(double val) {
		return new OracleDecimal(val);
	}
	
	public static OracleDecimal valueOf(long val) {
		return new OracleDecimal(val);
	}
	
}
