public void put(LoggingEvent o){
if (buf == null) {
        buf = new ArrayList();
    }
    buf.add(o);
}