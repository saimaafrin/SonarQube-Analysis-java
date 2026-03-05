public static String trimLeadingCharacter(String str,char leadingCharacter){
int i=0;  
    while(i<str.length() && str.charAt(i)==leadingCharacter){  
        i++;  
    }  
    return str.substring(i);  
}