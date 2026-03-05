public static boolean toBoolean(String value,boolean dEfault){
if(value==null) return dEfault;  
    value=value.trim().toLowerCase();  
    return "true".equals(value);  
}