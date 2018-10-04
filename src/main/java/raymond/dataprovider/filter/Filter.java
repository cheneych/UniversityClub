package raymond.dataprovider.filter;

import java.io.Serializable;

public interface Filter extends Serializable {

//    public boolean passesFilter(Object itemId, Item item)
//            throws UnsupportedOperationException;

    public boolean appliesToProperty(Object propertyId);

}
