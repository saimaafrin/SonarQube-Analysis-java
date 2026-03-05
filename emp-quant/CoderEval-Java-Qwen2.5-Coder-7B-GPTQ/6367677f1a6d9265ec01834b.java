public void put(LoggingEvent o){
synchronized (buf) {
        if (size == capacity){
            try { 
                buf.wait(); 
            } catch (InterruptedException e) {} 
        }
        buf[size++] = o; 
        buf.notifyAll(); 
    } 
}