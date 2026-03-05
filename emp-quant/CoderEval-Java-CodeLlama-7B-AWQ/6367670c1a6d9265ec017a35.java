private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
if(str==null||suffix==null)return false;
	if(suffix.length()>str.length())return false;
	if(ignoreCase){
		int j=suffix.length()-1;
		for(int i=str.length()-1;i>=0;i--){
			if(Character.toLowerCase(suffix.charAt(j))!=Character.toLowerCase(str.charAt(i)))return false;
			j--;
		}
	}else{
		int j=suffix.length()-1;
		for(int i=str.length()-1;i>=0;i--){
			if(suffix.charAt(j)!=str.charAt(i))return false;
			j--;
		}
	}
	return true;
}