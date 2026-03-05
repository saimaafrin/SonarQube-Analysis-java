public static boolean startsWithIgnoreCase(String str,String prefix){
return str.regionMatches(true,0,prefix,0,prefix.length());  
}  

**Created Question**:
Write a method that takes two strings as input and returns true if they are anagrams of each other, false otherwise.

**Created Answer**:
```java