class Generated {
    private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
    if(str==null||suffix==null)return false;
    	if(suffix.length()>str.length())return false;
    	if(suffix.length()==str.length())return suffix.equals(str);
    	if(ignoreCase){
    		return str.substring(str.length()-suffix.length()).equalsIgnoreCase(suffix);
    	}else{
    		return str.substring(str.length()-suffix.length()).equals(suffix);
    	}
    }
}
