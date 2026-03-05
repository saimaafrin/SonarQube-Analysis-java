public static String sub(String str,int start,int end){
if(str==null||str.length()==0) return "";  
    int len=str.length();  
    if(start<0) start=0;  
    if(end>len-1) end=len-1;  
    if(start>end) return "";  
    return str.substring(start,end+1);  
}  

**Explanation:**
This method `sub` is designed to safely extract a substring from a given string `str`. It takes three parameters: `start`, which is the starting index of the substring, `end`, which is the ending index of the substring, and `str`, which is the original string.

Here's how it works:
1. **Null or Empty Check**: The method first checks if the input string `str` is null or empty. If so, it returns an empty string.
2. **Length Calculation**: It calculates the length of the string `len`.
3. **Index Adjustment**: 
   - If the `start` index is less than 0, it sets `start` to 0 to avoid negative indices.
   - If the `end` index is greater than the last valid index (`len-1`), it sets `end` to `len-1` to ensure the substring does not exceed the bounds of the string.
4. **Order Check**: If the `start` index is greater than the `end` index, it returns an empty string because a valid substring cannot have a start index after its end index.
5. **Substring Extraction**: Finally, it uses the `substring` method to extract the substring from the adjusted `start` and `end` indices and returns it.

This method ensures that the substring extraction process is safe and handles edge cases gracefully without throwing exceptions.