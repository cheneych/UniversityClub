package raymond.data;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class Formatter {
	
	public static class FilesizeFormat {

		private boolean si;
		
		public FilesizeFormat(boolean siFormat) {
			this.si = siFormat;
		}
		
		/**
		 * Found on stackoverflow to format file size. Looks like windows uses si = false.
		 * @param bytes
		 * @param si
		 * @return
		 */
		public String format(long bytes) {
		    int unit = si ? 1000 : 1024;
		    if (bytes < unit) return bytes + " B";
		    int exp = (int) (Math.log(bytes) / Math.log(unit));
		    String pre = (si ? "kMGTPE" : "KMGTPE").charAt(exp-1) + (si ? "" : "i");
		    return String.format("%.1f %sB", bytes / Math.pow(unit, exp), pre);
		}
		
	}

	/*
	 * These are not thread safe and not localized properly -- need to be
	 * replaced
	 */

	// public final static DecimalFormat CURRENCY = new DecimalFormat("$###,###,###,###,##0.00");
	// public final static DecimalFormat DECIMAL = new DecimalFormat("###,###,###,###,##0.00");
	// public final static DecimalFormat INTEGER = new DecimalFormat("##############0");
	// public final static DecimalFormat SHORTPERCENT = new DecimalFormat("##0.00");
	// public final static DecimalFormat LONGPERCENT = new DecimalFormat("##0.000000");
	
	public final static SimpleDateFormat DATE = new SimpleDateFormat("MM/dd/yyyy");
	public final static SimpleDateFormat TIMESTAMP = new SimpleDateFormat("MM/dd/yyyy hh:mm aaa");
	public final static FilesizeFormat FILESIZE = new FilesizeFormat(false);

	public static NumberFormat getCurrencyFormat() {

		NumberFormat nf = null;
		nf = NumberFormat.getCurrencyInstance(Locale.US);
		nf.setMinimumIntegerDigits(1);
		nf.setMaximumIntegerDigits(15);
		nf.setMaximumFractionDigits(2);
		((java.text.DecimalFormat) nf).setParseBigDecimal(true);
		return nf;

	}

	public static NumberFormat getDecimalFormat() {
		NumberFormat nf = null;
		nf = NumberFormat.getInstance(Locale.US);
		nf.setMinimumIntegerDigits(1);
		nf.setMaximumIntegerDigits(15);
		nf.setMaximumFractionDigits(2);
		return nf;
	}

	public static NumberFormat getIntegerFormat() {
		
		NumberFormat nf = null;
		nf = NumberFormat.getIntegerInstance(Locale.US);
		nf.setMaximumIntegerDigits(15);
		return nf;

	}

	public static NumberFormat getLongPercentFormat() {
		
		NumberFormat nf = null;
		nf = NumberFormat.getPercentInstance(Locale.US);
		nf.setMaximumFractionDigits(6);
		nf.setMinimumFractionDigits(2);
		nf.setMinimumIntegerDigits(1);
		return nf;

	}

	public static NumberFormat getShortPercentFormat() {
		NumberFormat nf = null;
		nf = NumberFormat.getPercentInstance(Locale.US);
		nf.setMaximumFractionDigits(2);
		nf.setMinimumFractionDigits(2);
		nf.setMinimumIntegerDigits(1);
		return nf;
	}

}
