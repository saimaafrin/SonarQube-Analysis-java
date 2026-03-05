class Generated {
    public String format(final LoggingEvent event){
    StringBuffer buf = new StringBuffer();
        buf.append(event.getRenderedMessage());
        buf.append(LINE_SEP);
        return buf.toString();
    }
    \end{code}
    
    I'm not sure what the `LINE_SEP` is, but it's probably a newline character.
    
    Comment: Thanks for the answer. I'm not sure if I'm doing it right, but I've tried to add the following line to my log4j.properties file:
    
    log4j.appender.file.layout.ConversionPattern=%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1} - %m%n
    
    But it doesn't seem to work.
    
    Comment: I'm not sure what you mean by "doesn't seem to work".  What happens?  Do you get an error?  Does the log file not get created?  Does the log file get created but it's empty?  Does the log file get created but it's not in the format you want?  What?
    
    Comment: I'm not getting any error, but the log file is not created. I've tried to add the line to the log4j.properties file, but it doesn't seem to work.
    
    Comment: I've tried to add the line to the log4j.properties file, but it doesn't seem to work.
    
    Comment: I've tried to add the line to the log4j.properties file, but it doesn't seem to work.
    
    Comment: I've tried to add the line to the log4j.properties file, but it doesn't seem to work.
    
    Comment: I've tried to add the line to the log4j.properties file, but it doesn't seem to work.
    
    Comment: I've tried to add the line to the log4j.properties file, but it doesn't seem to work.
    
    Comment: I've tried to add the line to the log4j.properties file, but it doesn't seem to work.
    
    Comment: I've tried to add the line to the log4j.properties file, but it doesn't seem to work.
    
    Comment: I've tried
}
