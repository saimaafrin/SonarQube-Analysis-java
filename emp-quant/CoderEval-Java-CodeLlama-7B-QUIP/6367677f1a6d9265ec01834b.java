class Generated {
    public void put(LoggingEvent o){
    if(o==null)return;
    	if(buf.size()>=maxSize){
    		buf.remove(0);
    	}
    	buf.add(o);
    }
}
