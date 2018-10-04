/**
 * 
 */
package raymond.data;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/**
 * @author graumannc
 * 
 */
@SuppressWarnings("serial")
public class OracleBoolean extends BigDecimal {

	public static OracleBoolean FALSE = new OracleBoolean(0.0d);
	public static OracleBoolean TRUE = new OracleBoolean(1.0d);
	
	/**
	 * Justin added a boolean constructor.
	 * @param bool
	 */
	public OracleBoolean(boolean bool) {
		this(bool ? 1.0d : 0.0d);
	}
	
	public OracleBoolean(BigDecimal in) {
		super(in.toString());
	}

	/**
	 * @param in
	 */
	public OracleBoolean(char[] in) {
		super(in);
	}

	/**
	 * @param val
	 */
	public OracleBoolean(String val) {
		super(val);
	}
	
	public static OracleBoolean valueOf(String val) {
		if("true".equals(val)) {
			return OracleBoolean.TRUE;
		} else {
			return OracleBoolean.FALSE;
		}
	}
	
	public static OracleBoolean valueOf(boolean val) {
		if(val) {
			return OracleBoolean.TRUE;
		} else {
			return OracleBoolean.FALSE;
		}
	}

	/**
	 * @param val
	 */
	public OracleBoolean(double val) {
		super(val);
	}

	/**
	 * @param val
	 */
	public OracleBoolean(BigInteger val) {
		super(val);
	}

	/**
	 * @param val
	 */
	public OracleBoolean(int val) {
		super(val);
	}

	/**
	 * @param val
	 */
	public OracleBoolean(long val) {
		super(val);
	}

	/**
	 * @param in
	 * @param mc
	 */
	public OracleBoolean(char[] in, MathContext mc) {
		super(in, mc);
	}

	/**
	 * @param val
	 * @param mc
	 */
	public OracleBoolean(String val, MathContext mc) {
		super(val, mc);
	}

	/**
	 * @param val
	 * @param mc
	 */
	public OracleBoolean(double val, MathContext mc) {
		super(val, mc);
	}

	/**
	 * @param val
	 * @param mc
	 */
	public OracleBoolean(BigInteger val, MathContext mc) {
		super(val, mc);
	}

	/**
	 * @param unscaledVal
	 * @param scale
	 */
	public OracleBoolean(BigInteger unscaledVal, int scale) {
		super(unscaledVal, scale);
	}

	/**
	 * @param val
	 * @param mc
	 */
	public OracleBoolean(int val, MathContext mc) {
		super(val, mc);
	}

	/**
	 * @param val
	 * @param mc
	 */
	public OracleBoolean(long val, MathContext mc) {
		super(val, mc);
	}

	/**
	 * @param in
	 * @param offset
	 * @param len
	 */
	public OracleBoolean(char[] in, int offset, int len) {
		super(in, offset, len);
	}

	/**
	 * @param unscaledVal
	 * @param scale
	 * @param mc
	 */
	public OracleBoolean(BigInteger unscaledVal, int scale, MathContext mc) {
		super(unscaledVal, scale, mc);
	}

	/**
	 * @param in
	 * @param offset
	 * @param len
	 * @param mc
	 */
	public OracleBoolean(char[] in, int offset, int len, MathContext mc) {
		super(in, offset, len, mc);
	}
	
	public boolean toBoolean() {
		return TRUE.compareTo(this)==0;
	}
	
	public static boolean toBoolean(BigDecimal d) {
		return TRUE.compareTo(d)==0;
	}

	@Override
	public String toString() {
		if (TRUE.equals(this)) {
			return "true";
		} else {
			return "false";
		}
	}
	
	public BigDecimal toBigDecimal() {
		if (toBoolean()) {
			return new BigDecimal(1);
		} else {
			return new BigDecimal(0);
		}
	}
	
}
