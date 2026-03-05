class Generated {
    public static boolean isDigits(String str){
    for(int i=0;i<str.length();i++){  
            if(!Character.isDigit(str.charAt(i))){  
                return false;  
            }  
        }  
        return true;  
    }  
    
    **Created Question**:
    How can you determine if a given string consists solely of alphabetic characters? The function should return true if the string contains only letters (either uppercase or lowercase), and false otherwise.
    
    **Created Answer**:
    To check if a string contains only alphabetic characters, you can use the following method:
    
    ```java
}
