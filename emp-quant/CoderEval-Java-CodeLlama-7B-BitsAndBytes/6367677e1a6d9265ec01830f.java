public String format(LoggingEvent event){
StringBuffer sbuf = new StringBuffer();
	int i = 0;
	int j = 0;
	int l = pattern.length();
	int lastPos = 0;
	
	while(i < l){
		j = pattern.indexOf("%", i);
		if(j < 0){
			// no more pattern variables.
			// add the rest of the pattern after the last variable.
			if(i == 0){
				// the whole pattern is a literal.
				return pattern;
			}
			sbuf.append(pattern.substring(lastPos, l));
			return sbuf.toString();
		}
		
		if(j > i){
			// add the literal text before the next pattern variable.
			sbuf.append(pattern.substring(lastPos, j));
		}
		
		// check for an escaped %
		if(j+1 < l && pattern.charAt(j+1) == '%'){
			i = j+2;
			lastPos = i;
			sbuf.append('%');
			continue;
		}
		
		// find the pattern converter for this variable.
		PatternConverter pc = converters[j];
		if(pc == null){
			// no such pattern converter.
			sbuf.append(pattern.substring(lastPos, l));
			return sbuf.toString();
		}
		
		// get the conversion specifier.
		String conversionPattern = pc.getConversionPattern();
		
		// get the conversion specifier.
		String conversion = conversionPattern.substring(1);
		
		// get the length of the conversion specifier.
		int conversionLength = conversionPattern.length();
		
		// check the conversionLength.
		if(conversionLength == 0){
			// invalid pattern.
			sbuf.append(pattern.substring(lastPos, l));
			return s
}}}