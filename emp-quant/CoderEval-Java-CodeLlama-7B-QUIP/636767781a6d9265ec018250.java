public int decide(LoggingEvent event){
String message = event.getMessage();
    if(message.indexOf("ERROR")!=-1){
        return -1;
    }
    if(message.indexOf("WARN")!=-1){
        return 0;
    }
    if(message.indexOf("INFO")!=-1){
        return 1;
    }
    if(message.indexOf("DEBUG")!=-1){
        return 2;
    }
    return 3;
}
}