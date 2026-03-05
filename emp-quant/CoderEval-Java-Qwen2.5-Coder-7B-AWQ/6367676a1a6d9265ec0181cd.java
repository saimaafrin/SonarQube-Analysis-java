class Generated {
    public static String trimLeadingWhitespace(String str){
    if(str == null || str.length() == 0) return "";  
        int i = 0;  
        while(i < str.length() && str.charAt(i) == ' ') i++;  
        return str.substring(i);  
    }  
    
    **Trim the trailing whitespaces in a string.**
}
