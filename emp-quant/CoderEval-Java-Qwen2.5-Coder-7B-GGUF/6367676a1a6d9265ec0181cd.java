public static String trimLeadingWhitespace(String str){
if(str == null || str.length() == 0){  
        return str;  
    }  
    int i = 0;  
    while(i < str.length() && str.charAt(i) == ' '){  
        i++;  
    }  
    return str.substring(i);  
}