class Generated {
    private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
    if(str==null||suffix==null) return false;  
        if(ignoreCase) return str.equalsIgnoreCase(suffix);  
        else return str.endsWith(suffix);  
    }  
    
    **Explanation:**
    The function `endsWith` checks if the given string `str` ends with the specified `suffix`. It takes three parameters:
    - `str`: The string to be checked.
    - `suffix`: The suffix to check against.
    - `ignoreCase`: A boolean indicating whether the comparison should be case-insensitive.
    
    If either `str` or `suffix` is null, it returns `false`.
    
    If `ignoreCase` is true, it uses `equalsIgnoreCase` method to compare the strings without considering their case. If `ignoreCase` is false, it uses the `endsWith` method to check if `str` ends with `suffix`.
    
    This function is useful for checking string endings in a case-sensitive or insensitive manner.
}
