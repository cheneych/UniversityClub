/**
 * 
 */
package raymond.data;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;

/**
 * @author graumannc
 *
 */
@SuppressWarnings("serial")
public class OracleCurrency extends OracleDecimal {

	public final static OracleCurrency ZERO = new OracleCurrency(BigDecimal.ZERO);

	final int decimalplaces = 2;

	/**
	 * @param in
	 */
	public OracleCurrency(char[] in) {
		super(in);
		setScale(decimalplaces, ROUND_HALF_UP);
	}

	/**
	 * @param val
	 * @throws ParseException 
	 */
	public OracleCurrency(String val) {
	 	super(val != null ? val.replace("(", "-").replace(")", "").replace("$", "") : null);
		setScale(decimalplaces, ROUND_HALF_UP);
	}

	/**
	 * @param val
	 */
	public OracleCurrency(double val) {
		super(val);
		setScale(decimalplaces, ROUND_HALF_UP);
	}

	/**
	 * @param val
	 */
	public OracleCurrency(BigInteger val) {
		super(val);
		setScale(decimalplaces, ROUND_HALF_UP);
	}

	/**
	 * @param val
	 */
	public OracleCurrency(BigDecimal val) {
		super(val.toString());
		setScale(decimalplaces, ROUND_HALF_UP);
	}

	/**
	 * @param val
	 */
	public OracleCurrency(int val) {
		super(val);
		setScale(decimalplaces, ROUND_HALF_UP);
	}

	/**
	 * @param val
	 */
	public OracleCurrency(long val) {
		super(val);
		setScale(decimalplaces, ROUND_HALF_UP);
	}

	public static OracleCurrency valueOf(double val) {
		return new OracleCurrency(val);
	}

	public static OracleCurrency valueOf(String value) {
		return new OracleCurrency(value);
	}

	public static OracleCurrency valueOf(long val) {
		return new OracleCurrency(val);
	}

}
