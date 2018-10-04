package raymond.data;

import java.math.BigDecimal;
import java.math.BigInteger;

@SuppressWarnings("serial")
public class OracleInteger extends OracleDecimal {
	
	public static OracleInteger ZERO = new OracleInteger(0);

	public OracleInteger(char[] in) {
		super(in);
	}

	public OracleInteger(String val) {
		super(val);
	}

	public OracleInteger(double val) {
		super(val);
	}

	public OracleInteger(BigInteger val) {
		super(val);
	}
	
	public OracleInteger(BigDecimal val) {
		super(val);
	}

	public OracleInteger(int val) {
		super(val);
	}

	public OracleInteger(long val) {
		super(val);
	}
	
	public static OracleInteger valueOf(String val) {
		return new OracleInteger(val);
	}
	
	public static OracleInteger valueOf(long val) {
		return new OracleInteger(val);
	}

	public OracleInteger add(int augend){
		return new OracleInteger(super.add(new BigDecimal(augend)));
	}
	
}
