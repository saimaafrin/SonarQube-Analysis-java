class Generated {
    public static String trimLeadingWhitespace(String str){
    int i = 0;
    	while(i < str.length() && Character.isWhitespace(str.charAt(i))){
    		i++;
    	}
    	return str.substring(i);
    }
}
