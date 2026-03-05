class Generated {
    public String format(final LoggingEvent event){
    StringBuffer s = new StringBuffer();
    	s.append(event.getTimeStamp());
    	s.append(' ');
    	s.append(event.getLevel());
    	s.append(' ');
    	s.append(event.getLogger().getName());
    	s.append(" - ");
    	s.append(event.getRenderedMessage());
    	s.append('\n');
    	return s.toString();
    }
    }
}
