public static String deleteAny(String inString,String charsToDelete){
StringBuffer outBuffer = new StringBuffer();
	int inLength = inString.length();
	int charsToDeleteLength = charsToDelete.length();
	for(int i = 0; i < inLength; i++){
		boolean isCharToDelete = false;
		for(int j = 0; j < charsToDeleteLength; j++){
			if(inString.charAt(i) == charsToDelete.charAt(j)){
				isCharToDelete = true;
				break;
			}
		}
		if(!isCharToDelete){
			outBuffer.append(inString.charAt(i));
		}
	}
	return outBuffer.toString();
}