package raymond.dataprovider.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
public class ExistsTranslator implements FilterTranslator {
	
	Logger logger = LoggerFactory.getLogger(ExistsTranslator.class);

	public ExistsTranslator() {
	}

	@Override
	public boolean translatesFilter(Filter filter) {
		return filter instanceof Exists;
	}

	@Override
	public String getWhereStringForFilter(Filter filter, StatementHelper sh) {
		if(filter!=null) {
			Exists sql = (Exists) filter;
			String out = " EXISTS (" + sql.getSqlStatement() + ") ";
			logger.debug(out);
			return out;
		} else {
			return null;
		}
	}

}
