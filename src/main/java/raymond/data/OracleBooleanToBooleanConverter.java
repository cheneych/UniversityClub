/**
 * 
 */
package raymond.data;

import com.vaadin.data.Converter;
import com.vaadin.data.Result;
import com.vaadin.data.ValueContext;

/**
 * @author graumannc
 * 
 */
@SuppressWarnings("serial")
public class OracleBooleanToBooleanConverter implements Converter<Boolean, OracleBoolean> {

	@Override
	public Result<OracleBoolean> convertToModel(Boolean value, ValueContext context) {
		
		if (null == value || !value.booleanValue()) {
			return Result.ok(OracleBoolean.FALSE);
		} else {
			return Result.ok(OracleBoolean.TRUE);
		}
		
	}

	@Override
	public Boolean convertToPresentation(OracleBoolean value, ValueContext context) {
		if (OracleBoolean.TRUE.equals(value)) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

}
