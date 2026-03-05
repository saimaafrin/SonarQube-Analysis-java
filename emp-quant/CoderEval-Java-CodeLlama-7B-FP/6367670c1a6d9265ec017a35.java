class Generated {
    private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
    if(str==null||suffix==null)return false;
    	if(suffix.length()>str.length())return false;
    	if(suffix.length()==str.length())return ignoreCase?str.equalsIgnoreCase(suffix):str.equals(suffix);
    	int strOffset=str.length()-suffix.length();
    	int suffixOffset=suffix.length()-1;
    	if(ignoreCase){
    		for(int i=suffixOffset;i>=0;i--){
    			if(Character.toLowerCase(str.charAt(strOffset+i))!=Character.toLowerCase(suffix.charAt(i)))return false;
    		}
    	}else{
    		for(int i=suffixOffset;i>=0;i--){
    			if(str.charAt(strOffset+i)!=suffix.charAt(i))return false;
    		}
    	}
    	return true;
    }
}
