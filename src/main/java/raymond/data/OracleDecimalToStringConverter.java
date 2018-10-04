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
public class OracleDecimalToStringConverter implements Converter<String, OracleDecimal> {

	@Override
	public Result<OracleDecimal> convertToModel(String value, ValueContext context) {
			if (null != value) {
				return Result.ok(new OracleDecimal(value));
			} else {
				return Result.ok(OracleDecimal.ZERO);
			}
	}

	@Override
	public String convertToPresentation(OracleDecimal value, ValueContext context) {
		if (null != value) {
			return Formatter.getDecimalFormat().format(value);
		} else {
			return Formatter.getDecimalFormat().format(0.0d);
		}
	}

}
