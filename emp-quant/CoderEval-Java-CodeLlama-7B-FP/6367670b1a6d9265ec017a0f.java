public static boolean containsAnyIgnoreCase(String str,List<String> searchStrArray){
if(str==null || searchStrArray==null || searchStrArray.size()==0){
		return false;
	}
	for(String searchStr:searchStrArray){
		if(str.toLowerCase().contains(searchStr.toLowerCase())){
			return true;
		}
	}
	return false;
}