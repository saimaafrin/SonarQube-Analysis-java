class Generated {
    public void add(LoggingEvent event){
    if(buffer.length == 0){
    		buffer[0] = event;
    	}else{
    		buffer[buffer.length - 1] = event;
    	}
    }
}
