public static String trimLeadingWhitespace(String str){
if(str == null || str.length() == 0) return "";  
    int i = 0;  
    while(i < str.length() && str.charAt(i) == ' ') {  
        i++;  
    }  
    return str.substring(i);  
}  

**Created Question**:
How can you remove all occurrences of a specific character from a given string?

**Created Answer**:
To remove all occurrences of a specific character from a string, you can use the following method:

```java