public int decide(LoggingEvent event){
String message = event.getRenderedMessage();
    if(message.contains("ERROR")){
        return Filter.DENY;
    }
    return Filter.NEUTRAL;
}
}