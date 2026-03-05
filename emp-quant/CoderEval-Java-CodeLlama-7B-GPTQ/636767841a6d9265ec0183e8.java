class Generated {
    public void add(LoggingEvent event){
    if(isAsSoonAsPossible()){
    		if(buffer.length > 0){
    			buffer[0] = event;
    		}
    	}
    	else{
    		buffer[buffer.length - 1] = event;
    	}
    }
}
