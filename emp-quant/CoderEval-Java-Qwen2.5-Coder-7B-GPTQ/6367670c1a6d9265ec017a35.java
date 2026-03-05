class Generated {
    private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
    if(str==null||suffix==null){  
            return false;  
        }  
        if(suffix.length()>str.length()){  
            return false;  
        }  
        int strLength=str.length();  
        int suffixLength=suffix.length();  
        if(ignoreCase){  
            return str.regionMatches(true,strLength-suffixLength,suffix,0,suffixLength);  
        }else{  
            return str.regionMatches(false,strLength-suffixLength,suffix,0,suffixLength);  
        }  
    }  
    
    **Explanation:**
    The function `endsWith` checks if the given string `str` ends with the specified `suffix`. It takes three parameters:
    - `str`: The string to be checked.
    - `suffix`: The suffix to check against.
    - `ignoreCase`: A boolean indicating whether the comparison should be case-insensitive.
    
    Here's how it works:
    1. **Null Check**: If either `str` or `suffix` is null, the function returns `false`.
    2. **Length Check**: If the length of `suffix` is greater than that of `str`, the function also returns `false` because a longer string cannot end with a shorter one.
    3. **Region Matches**: 
       - If `ignoreCase` is `true`, it uses `regionMatches(true, ...)` which performs a case-insensitive comparison starting from the end of `str` and comparing it with `suffix`.
       - If `ignoreCase` is `false`, it uses `regionMatches(false, ...)` which performs a case-sensitive comparison under the same conditions.
    
    This function is useful for checking suffixes in strings while optionally ignoring case sensitivity.
}
