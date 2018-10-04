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
public class OracleIntegerToStringConverter implements Converter<String, OracleInteger> {

	@Override
	public Result<OracleInteger> convertToModel(String value, ValueContext context) {
			if (null != value) {
				return Result.ok(new OracleInteger(value));
			} else {
				return Result.ok(OracleInteger.ZERO);
			}
	}

	@Override
	public String convertToPresentation(OracleInteger value, ValueContext context) {
		if(value==null) return "";
		return Formatter.getIntegerFormat().format(value);
	}

}
