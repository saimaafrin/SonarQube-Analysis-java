public static int lastIndexOf(String str,String searchStr){
if(str==null||str.isEmpty()) return INDEXNOTFOUND;  
    return str.lastIndexOf(searchStr);  
}  

**Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.**

```java