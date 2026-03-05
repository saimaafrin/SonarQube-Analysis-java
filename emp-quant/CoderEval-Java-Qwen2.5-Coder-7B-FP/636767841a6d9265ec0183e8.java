class Generated {
    public void add(LoggingEvent event){
    synchronized (buffer){
            buffer.add(event);
            buffer.notifyAll();
        }
    }
    
    **/Remove and return the first event from the buffer. If no events are available, wait until one is added.**/
}
