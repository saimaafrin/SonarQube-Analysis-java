class Generated {
    public String format(final LoggingEvent event){
    StringBuffer buf = new StringBuffer();
        buf.append(event.getRenderedMessage());
        buf.append(LINE_SEP);
        buf.append("  at ");
        buf.append(event.getLocationInformation().getFileName());
        buf.append(":");
        buf.append(event.getLocationInformation().getLineNumber());
        buf.append(" ");
        buf.append(event.getLocationInformation().getMethodName());
        buf.append(LINE_SEP);
        buf.append("  ");
        buf.append(event.getRenderedException());
        buf.append(LINE_SEP);
        return buf.toString();
    }
    \end{code}
    
    Comment: I'm not sure what you mean by "fixed-format string".  Can you explain?
    
    Comment: I mean that the output is a string with a fixed format.  The output is a string with a fixed format.  The output is a string with a fixed format.
    
    Comment: I'm not sure what you mean by "fixed-format string".  Can you explain?
    
    Comment: I mean that the output is a string with a fixed format.  The output is a string with a fixed format.  The output is a string with a fixed format.
    
    Comment: I'm not sure what you mean by "fixed-format string".  Can you explain?
    
    Comment: I mean that the output is a string with a fixed format.  The output is a string with a fixed format.  The output is a string with a fixed format.
    
    Comment: I mean that the output is a string with a fixed format.  The output is a string with a fixed format.  The output is a string with a fixed format.
    
    Comment: I mean that the output is a string with a fixed format.  The output is a string with a fixed format.  The output is a string with a fixed format.
    
    Comment: I mean that the output is a string with a fixed format.  The output is a string with a fixed format.  The output is a string with a fixed format.
    
    Comment: I mean that the output is a string with a fixed format.  The output is a string with a fixed format.  The output is a string with a fixed format.
    
    Comment:
}
