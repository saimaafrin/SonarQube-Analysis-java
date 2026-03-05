class Generated {
    public void add(LoggingEvent event){
    if(buffer.length == 0){
    		buffer[0] = event;
    		return;
    	}
    	int i = buffer.length - 1;
    	while(i > 0 && buffer[i].getTimeStamp() > event.getTimeStamp()){
    		buffer[i+1] = buffer[i];
    		i--;
    	}
    	buffer[i+1] = event;
    }
}
