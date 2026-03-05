class Generated {
    public int decide(LoggingEvent event){
    String message = event.getMessage().toString();  
        if (message.contains("error")){  
            return 1;  
        }  
        if (message.contains("warning")){  
            return 2;  
        }  
        if (message.contains("info")){  
            return 3;  
        }  
        return 0;  
    }  
    
    **Created Question**:
    Implement a method to check if a given string matches a specific pattern.
    
    **Created Answer**:
    ```java
}
