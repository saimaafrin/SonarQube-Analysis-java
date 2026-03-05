public void add(LoggingEvent event){
synchronized (buffer){
        buffer.add(event);
    }
}