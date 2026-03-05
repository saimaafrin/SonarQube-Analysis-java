class Generated {
    private static boolean startsWith(final String str,final String prefix,final boolean ignoreCase){
    if(str==null||prefix==null){  
            return str==prefix;  
        }  
        if(ignoreCase){  
            return str.regionMatches(true,0,prefix,0,prefix.length());  
        }else{  
            return str.startsWith(prefix);  
        }  
    }  
    
    **Example**  
    ```java
}
