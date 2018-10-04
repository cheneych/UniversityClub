package raymond.dataprovider.filter;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
public class InTranslator implements FilterTranslator {
	
	Logger logger = LoggerFactory.getLogger(InTranslator.class);

	@Override
	public boolean translatesFilter(Filter filter) {
		return filter instanceof In;
	}

	@Override
	public String getWhereStringForFilter(Filter filter, StatementHelper sh) {
		In in = (In) filter;
		
		StringBuffer parameters = new StringBuffer();
		parameters.append(" IN (");
		
		Collection<?> values = in.getValues();
		int x=1;
		for(Object o : values) {
			sh.addParameterValue(o);
			parameters.append(" ?");
			if(x != values.size()) {
				parameters.append(",");
			} else {
				parameters.append(") ");
			}
			x++;
		}
		return QueryBuilder.quote(in.getPropertyId()) + parameters.toString();
	}

}
