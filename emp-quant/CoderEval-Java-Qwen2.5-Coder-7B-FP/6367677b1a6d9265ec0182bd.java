public String format(final LoggingEvent event){
StringBuffer sbuf = new StringBuffer(128);  
    sbuf.append(event.getLoggerName());  
    sbuf.append(" ");  
    sbuf.append(event.getLevel().toString());  
    sbuf.append(" [");  
    sbuf.append(event.getTimeStamp());  
    sbuf.append("] ");  
    sbuf.append(event.getMessage());  
    return sbuf.toString();  
}  

**Explanation:**
- The `format` method takes a `LoggingEvent` object as input.
- It initializes a `StringBuffer` to build the formatted log message.
- The logger name, logging level, timestamp, and message are appended to the `StringBuffer`.
- Finally, it returns the formatted log message as a `String`.

This method provides a simple and consistent way to format log messages for easy reading and analysis.