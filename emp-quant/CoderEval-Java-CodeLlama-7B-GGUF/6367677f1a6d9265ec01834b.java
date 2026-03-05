public void put(LoggingEvent o){
if(o == null)
		return;
	if(buf.length() > 0)
		buf.append(LINE_SEP);
	buf.append(o.toString());
}