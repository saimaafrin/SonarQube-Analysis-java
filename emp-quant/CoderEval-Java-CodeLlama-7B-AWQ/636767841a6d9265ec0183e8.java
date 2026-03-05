class Generated {
    public void add(LoggingEvent event){
    if(event == null)
    		return;
    	if(buffer.size() == 0)
    		first = event;
    	buffer.add(event);
    	last = event;
    	if(buffer.size() > maxSize)
    		flushBuffer();
    }
}
