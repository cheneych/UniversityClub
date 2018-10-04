package raymond.dataprovider.filter;

import java.util.Arrays;
import java.util.Collection;
//import com.vaadin.data.Item;

@SuppressWarnings("serial")
public class In implements Filter {

	private final Object propertyId;
	private Collection<?> values;

	public In(Object propertyId, Object... values) {
		this.propertyId = propertyId;
		this.values = Arrays.asList(values);
	}
	
	public In(Object propertyId, Collection<?> values) {
		this.propertyId = propertyId;
		this.values = values;
	}
	
//	@Override
//	public boolean passesFilter(Object itemId, Item item) throws UnsupportedOperationException {
//		return values.contains(item.getItemProperty(getPropertyId()).getValue());
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
	 * @return the values
	 */
	public Collection<?> getValues() {
		return values;
	}
	
	public void setValues(Collection<?> newValues) {
		values = newValues;
	}

}
