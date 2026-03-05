private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
if(str==null||suffix==null){  
        return false;  
    }  
    if(ignoreCase){  
        return str.toUpperCase().endsWith(suffix.toUpperCase());  
    }else{  
        return str.endsWith(suffix);  
    }  
}