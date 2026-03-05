class Generated {
    public static String findAndSubst(String key,Properties props){
    try{  
            String val=props.getProperty(key);  
            if(val==null) return null;  
            return subst(val,props);  
        }catch(Exception e){  
            return null;  
        }  
    }
}
