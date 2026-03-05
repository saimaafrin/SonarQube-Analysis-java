public static boolean isDigits(String str){
if(str==null) return false;  
    for(int i=0;i<str.length();i++){  
        if(!Character.isDigit(str.charAt(i))){  
            return false;  
        }  
    }  
    return true;  
}  

**Check whether a character string is a dight. If yes, true is returned. Otherwise, false is returned.**/