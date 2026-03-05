class Generated {
    public static String sub(String str,int start,int end){
    if(str==null){  
            return null;  
        }  
        if(start<0){  
            start=0;  
        }  
        if(end>str.length()){  
            end=str.length();  
        }  
        return str.substring(start,end);  
    }  
    
    **Get a substring from the specified String avoiding exceptions.**
}
