class Generated {
    public static String deleteAny(String inString,String charsToDelete){
    StringBuilder sb = new StringBuilder(inString);
    	for(int i = 0; i < charsToDelete.length(); i++){
    		int index = sb.indexOf(charsToDelete.charAt(i));
    		while(index != -1){
    			sb.deleteCharAt(index);
    			index = sb.indexOf(charsToDelete.charAt(i));
    		}
    	}
    	return sb.toString();
    }
}
