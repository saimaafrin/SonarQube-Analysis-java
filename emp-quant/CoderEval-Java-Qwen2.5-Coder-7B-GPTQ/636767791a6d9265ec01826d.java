public static String findAndSubst(String key,Properties props){
try{  
        String value = props.getProperty(key);  
        if(value != null){  
            return subst(value);  
        }else{  
            return "";  
        }  
    }catch(Exception e){  
        return "";  
    }  
}