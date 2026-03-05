class Generated {
    public int decide(LoggingEvent event){
    String message = event.getMessage();  
        if (message.matches(".*\\b\\d+\\b.*")) {  
            return 1;  
        }  
        return 0;  
    }  
    
    **Explanation**:
    The function `decide` takes a `LoggingEvent` object as an argument. It retrieves the message from the event using `event.getMessage()`. The message is then checked against a regular expression using the `matches` method. The regular expression `.*\\b\\d+\\b.*` is designed to match any string that contains at least one digit. If the message matches this pattern, the function returns `1`, indicating a decision based on the message. If the message does not match, the function returns `0`.
}
