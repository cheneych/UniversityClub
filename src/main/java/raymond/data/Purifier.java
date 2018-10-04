package raymond.data;

public final class Purifier {
	
	/**
	 * Removes Microsoft Smart Characters
	 * @param in
	 * @return
	 */
	public final static String purify(String in) {
		
				/*
				 * s = s.replace( (char)145, (char)'\''); s = s.replace( (char)8216,
				 * (char)'\''); // left single quote s = s.replace( (char)146,
				 * (char)'\''); s = s.replace( (char)8217, (char)'\''); // right single
				 * quote s = s.replace( (char)147, (char)'\"'); s = s.replace(
				 * (char)148, (char)'\"'); s = s.replace( (char)8220, (char)'\"'); //
				 * left double s = s.replace( (char)8221, (char)'\"'); // right double s
				 * = s.replace( (char)8211, (char)'-' ); // em dash?? s = s.replace(
				 * (char)150, (char)'-' );
				 */
				
				// Are regexes faster?
				//	s = s.replaceAll("[\\x91\\x2018\\x92\\x2019]", "'").replaceAll("[\\x93\\x94\\x201C\\x201D]", "\"").replaceAll("[\\x2013\\x96]", "-");
		
				String out = null;
				if(null!=in && !in.isEmpty()) {
					out = in.trim().replaceAll("[\\x91\\u2018\\x92\\u2019\\u201A\\u2039\\u203A]", "'").replaceAll("[\\x93\\x94\\u201C\\u201D\\u201E\\u201F]", "\"").replaceAll("[\\u2013\\u2014\\x96]", "-").replaceAll("\\u02DC", "~");
				} 

				return out;
	}
	
	/**
	 * Removes all filesystem reserved characters
	 * 
	 * @param inFileName
	 * @return
	 */
	public final static String purifyFileName(String inFileName) {
		String out = null;
		if(inFileName != null) {
			out = purify(inFileName);
			out = out.replaceAll("/", "").replaceAll("\\", "").replaceAll("?", "").replaceAll("%", "").replaceAll(":","").replaceAll("|","").replaceAll("\"", "").replaceAll("'", "").replaceAll("<", "").replaceAll(">", "").replaceAll("$","").replaceAll(" ", "_");
		}
		return out;
	}

}
