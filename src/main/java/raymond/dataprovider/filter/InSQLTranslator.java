package raymond.dataprovider.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
public class InSQLTranslator implements FilterTranslator {
	
	Logger logger = LoggerFactory.getLogger(InSQLTranslator.class);

	public InSQLTranslator() {
	}

	@Override
	public boolean translatesFilter(Filter filter) {
		return filter instanceof InSQL;
	}

	@Override
	public String getWhereStringForFilter(Filter filter, StatementHelper sh) {
		if(filter!=null) {
			InSQL insql = (InSQL) filter;
			String out = QueryBuilder.quote(insql.getPropertyId()) + " IN (" + insql.getSqlStatement() + ") ";
			logger.debug(out);
			return out;
		} else {
			return null;
		}
	}

}
