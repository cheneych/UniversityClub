package raymond.dataprovider.filter;

@SuppressWarnings("serial")
public class LowercaseTranslator implements FilterTranslator {

	@Override
    public boolean translatesFilter(Filter filter) {
        return filter instanceof LowercaseFilter;
    }
	
	@Override
    public String getWhereStringForFilter(Filter filter, StatementHelper sh) {
		LowercaseFilter lcf = (LowercaseFilter) filter;
		sh.addParameterValue(lcf.getFilterString());
		return " lower(" + QueryBuilder.quote(lcf.getPropertyId()) + ") = lower(?)";
	}
}
