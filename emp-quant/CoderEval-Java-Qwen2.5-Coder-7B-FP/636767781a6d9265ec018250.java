public int decide(LoggingEvent event){
String message = event.getMessage().toString();  
    if (message.contains("error")) {  
        return 1; // Error occurred  
    } else if (message.contains("warning")) {  
        return 2; // Warning occurred  
    } else if (message.contains("info")) {  
        return 3; // Informational message  
    } else {  
        return 0; // No specific match found  
    }  
}  

**Created Question**:
Implement a method to check if a given string matches any of the specified patterns.

**Created Answer**:
```java