public static int lastIndexOf(String str,String searchStr){
if(str.length()==0)
		return INDEXNOTFOUND;
	int lastIndex=str.lastIndexOf(searchStr);
	if(lastIndex==-1)
		return INDEXNOTFOUND;
	return lastIndex;
}