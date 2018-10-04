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
public class OracleCurrencyToStringConverter implements Converter<String, OracleCurrency> {

	@Override
	public Result<OracleCurrency> convertToModel(String value, ValueContext context) {
		if (value == null || "".equals(value.trim())) {
			return Result.ok(OracleCurrency.ZERO);
		} else {
			return Result.ok(new OracleCurrency(value.trim()));
		}
	}

	@Override
	public String convertToPresentation(OracleCurrency value, ValueContext context) {
		// TODO Auto-generated method stub
		return null;
	}

}
