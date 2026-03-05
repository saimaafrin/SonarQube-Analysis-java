public static String trimTrailingWhitespace(String str){
if(str == null || str.length() == 0){  
        return str;  
    }  
    int i = str.length() - 1;  
    while(i >= 0 && str.charAt(i) == ' '){  
        i--;  
    }  
    return str.substring(0, i + 1);  
}  

**Trim the start space of the str.**