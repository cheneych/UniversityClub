package raymond.TestDB;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.Query;

import raymond.data.OracleBoolean;
import raymond.data.OracleDecimal;
import raymond.data.Purifier;
import raymond.dataprovider.filter.Filter;
import raymond.dataprovider.filter.QueryBuilder;
import raymond.dataprovider.filter.StatementHelper;
import raymond.TestReserve.*;

public abstract class DataService<T> {

	protected final static transient Logger logger = LoggerFactory.getLogger(DataService.class);

	protected String sqlQuery;

	private boolean filterIgnored = false;

	protected DataSource dataSource;

	public DataService(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	java.util.List<Filter> filters = new ArrayList<Filter>();
	java.util.List<Filter> mandatoryfilters = new ArrayList<Filter>();

	public void removeFilters() {
		filters.clear();
	}

	public void addFilter(Filter f) {
		filters.add(f);
	}

	public void removeMandatoryFilters() {
		mandatoryfilters.clear();
	}

	public void addMandatoryFilter(Filter f) {
		mandatoryfilters.add(f);
	}

	public void setMandatoryFilters(List<Filter> f) {
		mandatoryfilters = f;
	}

	public void setMandatoryFilters(Filter... f) {
		setMandatoryFilters((List<Filter>) Arrays.asList(f));
	}

	public String getRowCountSQL(Query<T, Filter> query, StatementHelper statementHelper) throws SQLException {

		StringBuilder b = new StringBuilder("select count(*) from (").append(getSQL(query, statementHelper)).append(")");
		logger.debug(b.toString());
		return b.toString();
	}
	
	protected String getSQL(Query<T, Filter> query, StatementHelper statementHelper) {

		StringBuilder resultQuery;

		if ("WHERE".indexOf(sqlQuery.toUpperCase()) != -1) {
			resultQuery = new StringBuilder("select * from ( ");
			resultQuery.append(sqlQuery);
			resultQuery.append(" ) ");
		} else {
			resultQuery = new StringBuilder(sqlQuery);
		}

		if (query.getFilter().isPresent() || mandatoryfilters.size() > 0 || filters.size() > 0) {

			ArrayList<Filter> allfilters = new ArrayList<Filter>();
			if (mandatoryfilters.size() > 0) {
				allfilters.addAll(mandatoryfilters);
			}
			if (filters.size() > 0) {
				allfilters.addAll(filters);
			}
			if (query.getFilter().isPresent()) {
				allfilters.add(query.getFilter().get());
			}

			resultQuery.append(QueryBuilder.getWhereStringForFilters(allfilters, statementHelper));
		}

		if (query.getOffset() > 0) {
			resultQuery.append(" OFFSET ");
			resultQuery.append(query.getOffset());
			resultQuery.append(" ROWS ");
		}
		
		if(query.getLimit()>0) {
			resultQuery.append(" FETCH FIRST ");
			resultQuery.append(query.getLimit());
			resultQuery.append(" ROWS ONLY ");
		}

		logger.debug(resultQuery.toString());
		System.err.println(resultQuery.toString());

		return resultQuery.toString();
	}
	
	public static Integer getInteger(ResultSet rs, int pos) throws SQLException {
		return new Integer(rs.getInt(pos));
	}

	public static BigDecimal getBigDecimal(ResultSet rs, int pos) throws SQLException {
		return rs.getBigDecimal(pos);
	}

	public static void setBigDecimal(PreparedStatement call, int pos, Object value) throws SQLException {

		if (value == null) {
			// WARNING - We always set a BigDecimal to 0 if it is null.
			logger.trace("Setting parameter {} to BigDecimal 0 as null default", pos);
			call.setBigDecimal(pos, new OracleDecimal(0));
		} else if (value instanceof OracleBoolean) {
			logger.trace("Setting parameter {} to {}", pos, ((OracleBoolean) value).toBigDecimal());
			call.setBigDecimal(pos, ((OracleBoolean) value).toBigDecimal());
		} else if (value instanceof BigDecimal) {
			call.setBigDecimal(pos, (BigDecimal) value);
		} else if (value instanceof Number) {
			call.setBigDecimal(pos, new BigDecimal(((Number) value).toString()));
		} else {
			logger.trace("Setting parameter {} to {}", pos, (BigDecimal) value);
			call.setBigDecimal(pos, (BigDecimal) value);
		}

	}

	public abstract T getRow(ResultSet rs) throws SQLException;

	public Stream<T> fetch(Query<T, Filter> query) {
		System.out.println("enter");
		logger.error("enter f");
		ArrayList<T> list = new ArrayList<T>();
		
		StatementHelper statementHelper = new StatementHelper();
		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement stmt = conn.prepareStatement(getSQL(query, statementHelper))) {
				
				statementHelper.setParameterValuesToStatement(stmt);
				
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						list.add((T) getRow(rs));
					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("Unable to fetch results", e);
		}
		return list.stream();
	}
	
	
	public int count(Query<T, Filter> query) {

		StatementHelper statementHelper = new StatementHelper();
		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement stmt = conn.prepareStatement(getRowCountSQL(query, statementHelper))) {
				
				statementHelper.setParameterValuesToStatement(stmt);

				try (ResultSet rs = stmt.executeQuery()) {

					if (rs.next()) {
						int x = rs.getInt(1);
						logger.debug("count = {}", x);
						return x;
					}
				}
			}

		} catch (SQLException e) {
			logger.error("Unable to count results", e);
		}

		return 0;
	}
	
	public DataProvider<T, Filter> getDataProvider() {
		return DataProvider.fromFilteringCallbacks(query->fetch(query), query -> count(query));
	}

	public static LocalDate getLocalDate(ResultSet rs, int pos) throws SQLException {
		java.sql.Date d = rs.getDate(pos);
		if (d != null) {
			return rs.getDate(pos).toLocalDate();
		} else {
			return null;
		}
	}
	
	public static LocalTime getLocalTime(ResultSet rs, int pos) throws SQLException {
		Timestamp d = rs.getTimestamp(pos);
		if(d!= null) {
			return rs.getTimestamp(pos).toLocalDateTime().toLocalTime();
		} else {
			return null;
		}
	}

	public static LocalDateTime getLocalDateTime(ResultSet rs, int pos) throws SQLException {
		java.sql.Timestamp t = rs.getTimestamp(pos);
		if (t != null) {
			return rs.getTimestamp(pos).toLocalDateTime();
		} else {
			return null;
		}
	}

	public static void setTimestamp(PreparedStatement call, int pos, Object value) throws SQLException {

		if (value == null) {

			logger.trace("Setting parameter {} to null timestamp", pos);
			call.setNull(pos, Types.TIMESTAMP);

		} else if (value instanceof Timestamp) {

			logger.trace("Setting parameter {} to {}", pos, (Timestamp) value);
			call.setTimestamp(pos, (Timestamp) value);

		} else if (value instanceof java.sql.Date) {

			logger.trace("Setting parameter {} to {}", pos, (java.sql.Date) value);
			call.setDate(pos, (java.sql.Date) value);

		} else if (value instanceof java.util.Date) {

			logger.trace("Setting parameter {} to {}", pos, (java.util.Date) value);
			call.setTimestamp(pos, new java.sql.Timestamp(((java.util.Date) value).getTime()));

		} else if (value instanceof LocalDate) {

			call.setDate(pos, java.sql.Date.valueOf((LocalDate) value));

		} else if (value instanceof LocalDateTime) {

			call.setTimestamp(pos, java.sql.Timestamp.valueOf((LocalDateTime) value));

		} else if (value instanceof LocalTime) {
			call.setTime(pos,  java.sql.Time.valueOf((LocalTime) value));
		}
	}

	public static Boolean getBoolean(ResultSet rs, int pos) throws SQLException {

		return rs.getBoolean(pos);

	}

	public static void setBoolean(PreparedStatement call, int pos, Object value) throws SQLException {

		if (value == null) {

			logger.trace("Setting parameter {} to Boolean Zero as null default", pos);
			setBigDecimal(call, pos, BigDecimal.ZERO);

		} else if (value instanceof Boolean) {

			if (Boolean.TRUE.equals((Boolean) value)) {

				setBigDecimal(call, pos, BigDecimal.ONE);

			} else {

				setBigDecimal(call, pos, BigDecimal.ZERO);

			}

		} else if (value instanceof OracleBoolean) {

			if (OracleBoolean.TRUE.equals((OracleBoolean) value)) {

				logger.trace("Setting parameter {} to Boolean One", pos);
				setBigDecimal(call, pos, BigDecimal.ONE);

			} else {

				logger.trace("Setting parameter {} to Boolean Zero", pos);
				setBigDecimal(call, pos, BigDecimal.ZERO);

			}

		} else {

			logger.trace("Setting parameter {} to {}", pos, ((Boolean) value).booleanValue());
			call.setBoolean(1, ((Boolean) value).booleanValue());

		}

	}

	public static void setString(PreparedStatement call, int pos, Object value) throws SQLException {

		if (value == null) {

			logger.trace("Setting parameter {} to null", pos);
			call.setNull(pos, Types.VARCHAR);
		} else {

			logger.trace("Setting parameter {} to {}", pos, value.toString());
			call.setString(pos, Purifier.purify(value.toString()));

		}

	}

	public static String getString(ResultSet rs, int pos) throws SQLException {
		return rs.getString(pos);
	}

	public boolean isFilterIgnored() {
		return filterIgnored;
	}

	public void setFilterIgnored(boolean filterIgnored) {
		this.filterIgnored = filterIgnored;
	}

}

