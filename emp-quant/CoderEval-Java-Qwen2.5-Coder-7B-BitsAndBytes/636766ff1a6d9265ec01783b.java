public static String sub(String str,int start,int end){
if(str==null||start<0||end>str.length()||start>end) return "";  
    return str.substring(start,end);  
}  

**Explanation:**
- The function `sub` takes three parameters: `str`, `start`, and `end`.
- It first checks if `str` is null or if `start` is less than 0, or if `end` is greater than the length of `str`, or if `start` is greater than `end`. If any of these conditions are true, it returns an empty string.
- If none of the conditions are met, it uses the `substring` method to extract a substring from `str` starting at index `start` and ending at index `end`.

This approach ensures that the function handles edge cases gracefully by returning an empty string instead of throwing an exception.