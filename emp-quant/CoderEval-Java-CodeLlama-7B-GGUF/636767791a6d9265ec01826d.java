class Generated {
    public static String findAndSubst(String key,Properties props){
    String value=props.getProperty(key);
    	if(value==null)
    		return null;
    	return substitute(value,props);
    }
}
