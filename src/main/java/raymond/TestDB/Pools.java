package raymond.TestDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.zaxxer.hikari.HikariDataSource;

public class Pools {

	public enum Names {
		RAYMOND, PSHR
	}

	public enum Mode {
		PRODUCTION, DEVELOPMENT
	}

	private final static transient Logger logger = LoggerFactory.getLogger(Pools.class);

	private HikariDataSource raymondConnectionPool = null;
	private HikariDataSource pshrConnectionPool = null;

	public final static Mode mode = Mode.PRODUCTION;

	public static final String raymondDBConnectionString = "jdbc:oracle:thin:@//128.206.190.72:1521/projex4.projex4db.cf.missouri.edu";
	public static final String raymondUserName = "raymond";
	public static final String raymondUserPassword = "Camgyc58";
	public static final int raymondMaxConnections = 5;

	public static String psHRDBConnectionString = "jdbc:oracle:thin:@//128.206.191.191:1521/cfapps.appdb.cf.missouri.edu";
	private static final String psHRUserName = "muop_ps";
	private static final String psHRUserPassword = "muop_user1026";
	public static final int psHRMaxConnections = 5;

	static Pools pools;
	
	public Pools getCurrent() {
		return pools;
	}
	
	public Pools() {

		raymondConnectionPool = new HikariDataSource() {
			{
				setJdbcUrl(raymondDBConnectionString);
				setDriverClassName("oracle.jdbc.OracleDriver");
				setUsername(raymondUserName);
				setPassword(raymondUserPassword);
				setMaximumPoolSize(raymondMaxConnections);
				setAutoCommit(false);
				addDataSourceProperty("setImplicitCachingEnabled", "true");
				setLeakDetectionThreshold(TimeUnit.MINUTES.toMillis(5));
				setMaxLifetime(TimeUnit.HOURS.toMillis(10));
			}
		};

		pshrConnectionPool = new HikariDataSource() {
			{
				setJdbcUrl(psHRDBConnectionString);
				setDriverClassName("oracle.jdbc.OracleDriver");
				setUsername(psHRUserName);
				setPassword(psHRUserPassword);
				setMaximumPoolSize(psHRMaxConnections);
				setAutoCommit(false);
				addDataSourceProperty("setImplicitCachingEnabled", "true");
				setLeakDetectionThreshold(TimeUnit.MINUTES.toMillis(5));
				setMaxLifetime(TimeUnit.HOURS.toMillis(10));
			}
		};

		pools = this;

	}

	/**
	 * 
	 * Universal method for getting the various connection pools. If you call
	 * use this method, you should use JDBCCloser.release to return the
	 * connection to the pool.
	 * 
	 * @param pool
	 * @return
	 */
	public static DataSource getConnectionPool(Pools.Names pool) {

		if (pools != null) {
			switch (pool) {
			case RAYMOND:
				return pools.raymondConnectionPool;
			case PSHR:
				return pools.pshrConnectionPool;
			}

		}
		return null;

	}

	public static Connection getConnection(Pools.Names pool) throws SQLException {

		try {
			return getConnectionPool(pool).getConnection();
		} catch (SQLException e) {
			throw e;
		}
	}

	public static void releaseConnection(Pools.Names pool, Connection conn) {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			logger.error(e.getMessage());
		}
	}

	public void shutdown() {
		raymondConnectionPool.close();
		pshrConnectionPool.close();
	}

}
