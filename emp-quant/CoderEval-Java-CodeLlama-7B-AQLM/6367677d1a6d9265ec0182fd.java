class Generated {
    public static boolean toBoolean(String value,boolean dEfault){
    if(value==null) return dEfault;
    	value=value.trim();
    	if(value.equalsIgnoreCase("true")) return true;
    	if(value.equalsIgnoreCase("false")) return false;
    	return dEfault;
    }
}
