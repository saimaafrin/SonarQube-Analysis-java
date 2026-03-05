public static String trimLeadingWhitespace(String str){
if(str == null || "".equals(str.trim())){  
        return "";  
    }  
    int i = 0;  
    while(i < str.length() && Character.isWhitespace(str.charAt(i))){  
        i++;  
    }  
    return str.substring(i);  
}  

**Trim the trailing whitespaces in a string.**