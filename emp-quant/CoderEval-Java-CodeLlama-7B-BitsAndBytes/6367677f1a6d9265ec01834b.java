public void put(LoggingEvent o){
if(o == null){
		return;
	}
	if(buf.size() >= maxSize){
		LoggingEvent e = (LoggingEvent)buf.get(0);
		if(e.getTimeStamp() < o.getTimeStamp()){
			buf.remove(0);
			buf.add(o);
		}
	}
	else{
		buf.add(o);
	}
}