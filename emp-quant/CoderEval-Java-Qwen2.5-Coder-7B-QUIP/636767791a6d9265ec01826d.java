public static String findAndSubst(String key,Properties props){
String value = props.getProperty(key);  
    if(value == null){  
        return key;  
    }  
    try{  
        return value.replaceAll("\\$\\{([^}]+)\\}","${$1}");  
    }catch(Exception e){  
        return value;  
    }  
}  

**The above code is not working as expected. Please correct it.**
 **