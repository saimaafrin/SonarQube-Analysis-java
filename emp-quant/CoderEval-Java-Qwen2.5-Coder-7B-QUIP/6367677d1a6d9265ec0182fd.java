public static boolean toBoolean(String value,boolean dEfault){
if(value==null) return dEfault;  
    value=value.trim().toLowerCase();  
    if(value.equals("true")) return true;  
    if(value.equals("false")) return false;  
    return dEfault;  
}  

**Check whether a string is true or false after ignore cases and trim the whitespaces at both ends. If so, its boolean value is returned. Otherwise, dEfault is returned.**