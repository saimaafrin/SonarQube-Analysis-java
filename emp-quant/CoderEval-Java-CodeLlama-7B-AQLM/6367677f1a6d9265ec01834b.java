public void put(LoggingEvent o){
if(o == null){
		return;
	}
	if(buf == null){
		buf = new LoggingEvent[bufSize];
	}
	if(buf.length == bufSize){
		LoggingEvent[] newBuf = new LoggingEvent[bufSize*2];
		System.arraycopy(buf, 0, newBuf, 0, bufSize);
		buf = newBuf;
	}
	buf[bufSize++] = o;
}