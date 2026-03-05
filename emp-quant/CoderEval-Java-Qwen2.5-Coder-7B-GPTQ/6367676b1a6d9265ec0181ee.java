public static String trimTrailingWhitespace(String str){
if(str == null || "".equals(str.trim())){  
        return "";  
    }  
    int len = str.length();  
    int i = len - 1;  
    while(i >= 0 && Character.isWhitespace(str.charAt(i))){  
        i--;  
    }  
    return str.substring(0, i + 1);  
}  

**Test case:**
```java