public String format(final LoggingEvent event){
StringBuffer sbuf = new StringBuffer(128);
    sbuf.append(event.getLoggerName());
    sbuf.append(" - ");
    sbuf.append(event.getLevel().toString());
    sbuf.append(" - ");
    sbuf.append(event.getMessage());
    sbuf.append("\n");
    return sbuf.toString();
}