package raymond.dataprovider.filter;

//import com.vaadin.data.Item;
/**
 * InSQL implements an IN Filter for SQL statements.  It will only work with SQLContainer. 
 * 
 * It will probably not work with FilterTable.
 * 
 * @author graumannc
 *
 */
@SuppressWarnings("serial")
public class InSQL implements Filter {
	
	private final Object propertyId;
	private final String sqlStatement;

	public InSQL(String propertyId, String sqlStatement) {
		this.propertyId = propertyId;
		this.sqlStatement = sqlStatement;
	}
	
	/* Can only be used by SQLContainer */
//	@Override
//	public boolean passesFilter(Object itemId, Item item)
//			throws UnsupportedOperationException {
//		return false;
//	}

	@Override
	public boolean appliesToProperty(Object propertyId) {
		return getPropertyId() != null && getPropertyId().equals(propertyId);
	}

	/**
	 * @return the propertyId
	 */
	public Object getPropertyId() {
		return propertyId;
	}

	/**
	 * @return the sqlStatement
	 */
	public String getSqlStatement() {
		return sqlStatement;
	}

}
