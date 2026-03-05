public String format(LoggingEvent event){
StringBuffer buf = new StringBuffer();
	String pattern = getPattern(event);
	if(pattern == null){
		return null;
	}
	String result = format(pattern, event);
	if(result == null){
		return null;
	}
	if(result.length() > 0){
		buf.append(result);
	}
	return buf.toString();
}