public String format(final LoggingEvent event){
StringBuffer buf = new StringBuffer();
    buf.append(event.getTimeStamp());
    buf.append(" ");
    buf.append(event.getLevel());
    buf.append(" ");
    buf.append(event.getRenderedMessage());
    buf.append(" ");
    buf.append(event.getThreadName());
    buf.append(" ");
    buf.append(event.getLocationInformation().fullInfo);
    buf.append(" ");
    buf.append(event.getNDC());
    buf.append(" ");
    buf.append(event.getThrowableStrRep());
    return buf.toString();
}
}