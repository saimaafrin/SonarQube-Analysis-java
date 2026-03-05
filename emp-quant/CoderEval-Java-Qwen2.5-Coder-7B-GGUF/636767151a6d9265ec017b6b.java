class Generated {
    private static boolean startsWith(final String str,final String prefix,final boolean ignoreCase){
    if(str==null && prefix==null){ 
            return true; 
        } 
        if(str==null || prefix==null){ 
            return false; 
        } 
        if(ignoreCase){ 
            return str.regionMatches(true,0,prefix,0,prefix.length()); 
        } 
        return str.startsWith(prefix); 
    } 
    
    **The above code is working fine but I want to know if there is any other way to write this method using Java 8 features.**
    **You can use the `startsWith` method of the `String` class along with the `equalsIgnoreCase` method to achieve the same result. Here is an example:**
    
    ```java
}
