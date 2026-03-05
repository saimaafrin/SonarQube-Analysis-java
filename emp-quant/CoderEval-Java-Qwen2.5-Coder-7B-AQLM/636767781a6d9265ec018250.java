public int decide(LoggingEvent event){
String message = event.getMessage().toString();  
    if(message.contains("error")){  
        return 1;  
    }  
    if(message.contains("warning")){  
        return 2;  
    }  
    if(message.contains("info")){  
        return 3;  
    }  
    return 0;  
}  

**Created Question**:
How can you determine if a given string matches a specific pattern using regular expressions in Java?

**Created Answer**:
To determine if a given string matches a specific pattern using regular expressions in Java, you can use the `Pattern` and `Matcher` classes from the `java.util.regex` package. Here's an example:

```java