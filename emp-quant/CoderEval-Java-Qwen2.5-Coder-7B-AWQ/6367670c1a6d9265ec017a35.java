class Generated {
    private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
    if(str==null||suffix==null) return false;  
        if(ignoreCase) return str.toUpperCase().endsWith(suffix.toUpperCase());  
        else return str.endsWith(suffix);  
    }  
    
    **Explanation:**
    The function `endsWith` checks if the given string `str` ends with the specified suffix `suffix`. It takes an additional parameter `ignoreCase` which determines whether the comparison should be case-insensitive.
    
    - If either `str` or `suffix` is null, it returns false.
    - If `ignoreCase` is true, both `str` and `suffix` are converted to uppercase before checking if `str` ends with `suffix`.
    - If `ignoreCase` is false, the original strings are used for the comparison.
    
    This function is useful when you need to check the ending of a string in a case-sensitive or insensitive manner.
}
