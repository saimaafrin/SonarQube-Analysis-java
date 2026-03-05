class Generated {
    public void removeAppender(String name){
    if(name == null){
    		throw new IllegalArgumentException("Appender name cannot be null");
    	}
    	Appender appender = this.appenders.get(name);
    	if(appender == null){
    		throw new IllegalArgumentException("No appender named [" + name + "] was found in this logger");
    	}
    	this.appenders.remove(name);
    }
}
