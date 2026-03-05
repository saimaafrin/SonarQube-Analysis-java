public void put(LoggingEvent o){
if(o == null)
		return;
	if(buf.size() >= maxSize){
		LoggingEvent e = (LoggingEvent)buf.get(0);
		buf.remove(0);
		if(e != null)
			e.callerData = null;
	}
	buf.add(o);
}