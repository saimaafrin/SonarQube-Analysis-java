class Generated {
    public static String deleteAny(String inString,String charsToDelete){
    int len = inString.length();
    	StringBuffer outString = new StringBuffer(len);
    	for(int i=0;i<len;i++){
    		if(charsToDelete.indexOf(inString.charAt(i))==-1)
    			outString.append(inString.charAt(i));
    	}
    	return outString.toString();
    }
}
