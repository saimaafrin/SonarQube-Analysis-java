class Generated {
    public static String sub(String str,int start,int end){
    if(str==null||start<0||end>str.length()||start>end) return "";  
        return str.substring(start,end);  
    }  
    
    **Explanation:**
    The function `sub` takes three parameters: a string `str`, and two integers `start` and `end`. It returns a substring of `str` starting at index `start` and ending at index `end - 1`.
    
    Here's how it works:
    
    - The function first checks if `str` is null or if `start` is less than 0 or if `end` is greater than the length of `str` or if `start` is greater than `end`. If any of these conditions are true, it returns an empty string.
    - If none of the conditions are true, it uses the `substring` method of the `String` class to extract the substring from `str` starting at index `start` and ending at index `end - 1`.
    - Finally, it returns the extracted substring.
    
    This function avoids exceptions by checking for invalid input values before attempting to extract a substring.
}
