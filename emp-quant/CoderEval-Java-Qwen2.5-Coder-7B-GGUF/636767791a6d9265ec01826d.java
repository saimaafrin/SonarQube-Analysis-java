public static String findAndSubst(String key,Properties props){
String value = props.getProperty(key);  
    if(value == null){  
        return key;  
    }  
    try{  
        return subst(value,props);  
    }catch(Exception e){  
        return value;  
    }  
}