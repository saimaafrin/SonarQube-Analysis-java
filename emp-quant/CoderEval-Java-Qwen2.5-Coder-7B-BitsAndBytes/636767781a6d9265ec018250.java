public int decide(LoggingEvent event){
String message = event.getMessage().toString();
    if(message.contains("ERROR")){
        return 1;
    }
    else if(message.contains("WARNING")){
        return 2;
    }
    else{
        return 0;
    }
}