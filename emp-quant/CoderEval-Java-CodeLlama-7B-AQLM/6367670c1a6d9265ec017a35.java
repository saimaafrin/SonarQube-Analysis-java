private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
if(str==null||suffix==null)return false;
	if(suffix.length()>str.length())return false;
	if(suffix.length()==str.length())return ignoreCase?str.equalsIgnoreCase(suffix):str.equals(suffix);
	return ignoreCase?str.regionMatches(str.length()-suffix.length(),suffix,0,suffix.length()):str.endsWith(suffix);
}