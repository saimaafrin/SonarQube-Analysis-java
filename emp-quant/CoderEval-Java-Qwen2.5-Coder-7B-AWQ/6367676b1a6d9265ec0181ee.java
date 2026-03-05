public static String trimTrailingWhitespace(String str){
if(str == null || str.length() == 0) return "";  
    int i = str.length() - 1;  
    while(i >= 0 && Character.isWhitespace(str.charAt(i))){  
        --i;  
    }  
    return str.substring(0, i + 1);  
}  

**Test:**
String str = "Hello World   ";
System.out.println(trimTrailingWhitespace(str)); // Output: "Hello World"