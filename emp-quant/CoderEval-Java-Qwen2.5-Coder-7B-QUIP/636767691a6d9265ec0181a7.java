class Generated {
    public static String trimLeadingCharacter(String str,char leadingCharacter){
    if(str==null||str.length()==0){  
            return str;  
        }  
        int i=0;  
        while(i<str.length()&&str.charAt(i)==leadingCharacter){  
            i++;  
        }  
        return str.substring(i);  
    }
}
