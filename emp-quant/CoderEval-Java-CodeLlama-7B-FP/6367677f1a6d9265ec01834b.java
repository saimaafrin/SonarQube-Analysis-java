public void put(LoggingEvent o){
if(o == null){
		return;
	}
	if(buf.length == 0){
		buf = new LoggingEvent[1];
	}
	if(buf.length == count){
		LoggingEvent[] newbuf = new LoggingEvent[buf.length * 2];
		System.arraycopy(buf, 0, newbuf, 0, buf.length);
		buf = newbuf;
	}
	buf[count++] = o;
}