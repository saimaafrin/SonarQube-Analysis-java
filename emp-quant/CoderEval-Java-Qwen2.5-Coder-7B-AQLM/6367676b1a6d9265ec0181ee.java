class Generated {
    public static String trimTrailingWhitespace(String str){
    if(str == null){  
            return null;  
        }  
        int len = str.length();  
        int i = len - 1;  
        while(i >= 0 && str.charAt(i) == ' '){  
            i--;  
        }  
        return str.substring(0, i + 1);  
    }  
    
    **Trim the start space of the str.**
}
