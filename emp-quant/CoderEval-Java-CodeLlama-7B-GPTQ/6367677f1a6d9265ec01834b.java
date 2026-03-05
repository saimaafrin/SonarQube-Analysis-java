public void put(LoggingEvent o){
if(o == null)
		return;
	if(buf.length == 0){
		buf = new LoggingEvent[1];
		buf[0] = o;
		return;
	}
	if(buf.length == count){
		LoggingEvent[] newbuf = new LoggingEvent[count * 2];
		System.arraycopy(buf, 0, newbuf, 0, count);
		buf = newbuf;
	}
	buf[count++] = o;
}