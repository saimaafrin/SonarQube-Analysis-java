public static boolean isDigits(String str){
if(str == null || str.length() == 0) return false;  
    for(int i = 0; i < str.length(); i++){  
        char c = str.charAt(i);  
        if(c < '0' || c > '9') return false;  
    }  
    return true;  
}  

**Created Question**:
How can you determine if a given string represents a valid integer in Java?

**Created Answer**:
To check if a string is a valid integer in Java, you can use the `Integer.parseInt()` method within a try-catch block to handle any potential `NumberFormatException`. Here's how you can implement this:

```java