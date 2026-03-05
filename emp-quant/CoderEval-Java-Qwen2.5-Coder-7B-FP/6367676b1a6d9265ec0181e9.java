class Generated {
    public static boolean substringMatch(CharSequence str,int index,CharSequence substring){
    int subLen=substring.length();  
        if(index<0||index>str.length()-subLen) {  
            return false;  
        }  
        for(int i=0;i<subLen;i++) {  
            if(str.charAt(index+i)!=substring.charAt(i)) {  
                return false;  
            }  
        }  
        return true;  
    }  
    
    **Created Question**:
    Implement a method to check if a given string contains any of the specified characters.
    
    **Created Answer**:
    ```java
}
