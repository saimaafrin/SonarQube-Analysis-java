public void add(LoggingEvent event){
if(event == null)
		return;
	if(buffer.length == 0){
		buffer[0] = event;
		return;
	}
	int i = 0;
	while(i < buffer.length && buffer[i] != null){
		i++;
	}
	if(i == buffer.length){
		LoggingEvent[] newBuffer = new LoggingEvent[buffer.length + 10];
		System.arraycopy(buffer, 0, newBuffer, 0, buffer.length);
		buffer = newBuffer;
	}
	buffer[i] = event;
}