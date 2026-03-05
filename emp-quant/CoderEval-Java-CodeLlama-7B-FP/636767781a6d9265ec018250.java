public int decide(LoggingEvent event){
if(event.getRenderedMessage().indexOf(stringToMatch) != -1){
		return 1;
	}
	return 0;
}