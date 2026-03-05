class Generated {
    public static boolean isDigits(String str){
    if(str == null || str.length() <= 0) return false;  
        for(int i = 0; i < str.length(); i++){  
            char c = str.charAt(i);  
            if(c < '0' || c > '9') return false;  
        }  
        return true;  
    }  
    
    **Created Question**:
    How can you determine if a given string consists solely of alphabetic characters? The function should return true if the string contains only letters (either uppercase or lowercase), and false otherwise.
    
    **Created Answer**:
    To check if a string contains only alphabetic characters, you can use the following method:
    
    ```java
}
