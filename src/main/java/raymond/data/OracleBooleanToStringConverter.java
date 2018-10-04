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
public class OracleBooleanToStringConverter implements Converter<String, OracleBoolean> {

	/**
	 * 
	 */
	public OracleBooleanToStringConverter() { }

	@Override
	public Result<OracleBoolean> convertToModel(String value, ValueContext context) {
		if("true".equals(value)) {
			return Result.ok(OracleBoolean.TRUE);
		} else {
			return Result.ok(OracleBoolean.FALSE);
		}
	}

	@Override
	public String convertToPresentation(OracleBoolean value, ValueContext context) {
		return (null!=value ? value.toString() : null);
	}

}
