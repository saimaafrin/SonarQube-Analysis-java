class Generated {
    public static boolean toBoolean(String value,boolean dEfault){
    if(value==null)return dEfault;
    	String v=value.trim();
    	if(v.length()==0)return dEfault;
    	if(v.equalsIgnoreCase("true"))return true;
    	if(v.equalsIgnoreCase("false"))return false;
    	return dEfault;
    }
}
