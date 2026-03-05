public void add(LoggingEvent event){
synchronized (buffer){
        if(buffer.size() >= maxSize){
            buffer.removeFirst();
        }
        buffer.addLast(event);
    }
} 

**/Remove all events from the buffer.**/