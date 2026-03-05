public void put(LoggingEvent o){
synchronized(buf){
        if (buf.length == count) {
            int newLength = count * 2;
            LoggingEvent[] newBuf = new LoggingEvent[newLength];
            System.arraycopy(buf, 0, newBuf, 0, count);
            buf = newBuf;
        }
        buf[count++] = o;
    }
}