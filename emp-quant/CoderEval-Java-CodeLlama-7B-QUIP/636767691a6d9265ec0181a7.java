public static String trimLeadingCharacter(String str,char leadingCharacter){
if(str==null)
		return null;
	int i=0;
	for(;i<str.length();i++){
		if(str.charAt(i)!=leadingCharacter)
			break;
	}
	return str.substring(i);
}