public static boolean startsWithIgnoreCase(String str,String prefix){
if(str==null||prefix==null){  
        return false;  
    }  
    if(str.length()<prefix.length()){  
        return false;  
    }  
    String temp=str.substring(0,prefix.length());  
    return temp.equalsIgnoreCase(prefix);  
}  

**Created Question**:
Implement a method that takes a string and returns a new string with all the vowels removed.

**Created Answer**:
```java