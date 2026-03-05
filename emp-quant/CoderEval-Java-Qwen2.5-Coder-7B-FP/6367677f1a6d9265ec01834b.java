class Generated {
    public void put(LoggingEvent o){
    if (buf == null) {
            buf = new Object[10];
        }
        if (count >= buf.length) {
            int newLength = count * 2;
            Object[] newBuf = new Object[newLength];
            System.arraycopy(buf, 0, newBuf, 0, count);
            buf = newBuf;
        }
        buf[count++] = o; 
    }
}
