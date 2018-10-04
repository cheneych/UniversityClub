package raymond.dataprovider.filter;

//import com.vaadin.data.Item;
//import com.vaadin.data.Property;

@SuppressWarnings("serial")
public class LowercaseFilter implements Filter {

	final Object propertyId;
	final String filterString;
	
	public LowercaseFilter(Object propertyId, String filterString) {
		this.propertyId = propertyId;
		this.filterString = filterString.toLowerCase();
	}
	
//	@Override
//    public boolean passesFilter(Object itemId, Item item) {
//        final Property<?> p = item.getItemProperty(propertyId);
//        if (p == null) {
//            return false;
//        }
//        Object propertyValue = p.getValue();
//        if (propertyValue == null) {
//            return false;
//        }
//        final String value = propertyValue.toString().toLowerCase();
//        return value.equals(filterString);
//    }
	
	@Override
    public boolean appliesToProperty(Object propertyId) {
        return this.propertyId.equals(propertyId);
    }

	public Object getPropertyId() {
		return propertyId;
	}

	public String getFilterString() {
		return filterString;
	}
		
}
