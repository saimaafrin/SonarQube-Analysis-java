class Generated {
    public static String findAndSubst(String key,Properties props){
    try{ 
            String val = props.getProperty(key); 
            if(val != null) { 
                return subst(val,props); 
            } else { 
                return key; 
            } 
        } catch(Exception e) { 
            return key; 
        } 
    }
}
