public int decide(LoggingEvent event){
String message = event.getMessage().toString();  
    if(message.contains("error")){  
        return 1; // Error occurred  
    } else if(message.contains("warning")){  
        return 2; // Warning occurred  
    } else {  
        return 0; // No error or warning  
    }  
}  

**Created Question**:
How can you modify the `decide` method to handle different types of exceptions differently?

**Created Answer**:
To modify the `decide` method to handle different types of exceptions differently, you can add additional conditions that check for specific exception messages or patterns. Here's an example:

```java