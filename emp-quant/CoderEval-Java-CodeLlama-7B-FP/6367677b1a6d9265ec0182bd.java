class Generated {
    public String format(final LoggingEvent event){
    if(event == null){
    		return "";
    	}
    	StringBuffer sbuf = new StringBuffer();
    	sbuf.append(event.getRenderedMessage());
    	sbuf.append(LINE_SEP);
    	return sbuf.toString();
    }
    }
}
