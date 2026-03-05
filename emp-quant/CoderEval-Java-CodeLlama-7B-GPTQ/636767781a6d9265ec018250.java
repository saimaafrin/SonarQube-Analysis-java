class Generated {
    public int decide(LoggingEvent event){
    if(event.getRenderedMessage().indexOf(stringToMatch) != -1){
    		return 1;
    	}
    	else{
    		return 0;
    	}
    }
    }
}
