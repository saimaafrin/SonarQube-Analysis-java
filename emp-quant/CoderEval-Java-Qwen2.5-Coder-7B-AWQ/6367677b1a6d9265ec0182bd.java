class Generated {
    public String format(final LoggingEvent event){
    StringBuffer sbuf = new StringBuffer(128);  
        sbuf.append(event.getLoggerName());  
        sbuf.append(" ");  
        sbuf.append(event.getLevel().toString());  
        sbuf.append(" - ");  
        sbuf.append(event.getMessage());  
        sbuf.append("\n");  
        return sbuf.toString();  
    }  
    
    **Explanation:**
    - The method `format` takes a `LoggingEvent` object as its parameter.
    - It initializes a `StringBuffer` to build the formatted log message.
    - The logger name, log level, and message are appended to the `StringBuffer`.
    - A newline character is added at the end of the message.
    - Finally, the formatted log message is returned as a `String`.
    
    This simple formatter provides a basic structure for logging messages, which can be customized further based on specific requirements.
}
