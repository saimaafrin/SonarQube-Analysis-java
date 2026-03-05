class Generated {
    private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
    if(str==null||suffix==null)return false;
    	if(suffix.length()>str.length())return false;
    	if(suffix.length()==str.length())return ignoreCase?str.equalsIgnoreCase(suffix):str.equals(suffix);
    	int strOffset=str.length()-suffix.length();
    	int suffixOffset=0;
    	while(suffixOffset<suffix.length()){
    		if(ignoreCase?Character.toLowerCase(str.charAt(strOffset++))!=Character.toLowerCase(suffix.charAt(suffixOffset++)):str.charAt(strOffset++)!=suffix.charAt(suffixOffset++))return false;
    	}
    	return true;
    }
}
