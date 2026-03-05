class Generated {
    public static boolean toBoolean(String value,boolean dEfault){
    if(value==null) return dEfault;
    	value=value.trim().toLowerCase();
    	if(value.equals("true") || value.equals("yes") || value.equals("1")) return true;
    	if(value.equals("false") || value.equals("no") || value.equals("0")) return false;
    	return dEfault;
    }
}
