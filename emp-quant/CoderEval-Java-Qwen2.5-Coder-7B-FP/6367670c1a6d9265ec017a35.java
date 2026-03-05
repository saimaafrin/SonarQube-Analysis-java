class Generated {
    private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
    if(str==null||suffix==null) return false;  
        if(ignoreCase) return str.toUpperCase().endsWith(suffix.toUpperCase());  
        else return str.endsWith(suffix);  
    }  
    
    **Explanation:**
    The function `endsWith` checks if the given string (`str`) ends with the specified suffix (`suffix`). It takes an additional parameter `ignoreCase`, which determines whether the comparison should be case-insensitive.
    
    1. **Null Check**: The function first checks if either `str` or `suffix` is null. If so, it returns `false` because a null string cannot end with any suffix.
       
    2. **Case-Insensitive Comparison**: If `ignoreCase` is `true`, both the original string and the suffix are converted to uppercase using `toUpperCase()`. This ensures that the comparison is not affected by the case of the characters.
    
    3. **Standard EndsWith Method**: If `ignoreCase` is `false`, the function uses the standard `String` method `endsWith()` directly, which performs a case-sensitive comparison.
    
    This function is useful for scenarios where you need to check if a string ends with a specific pattern, possibly ignoring case differences.
}
