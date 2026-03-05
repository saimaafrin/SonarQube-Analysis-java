public static int lastIndexOf(String str,String searchStr){
if(str.length()==0)
		return INDEXNOTFOUND;
	int index=str.lastIndexOf(searchStr);
	if(index==-1)
		return INDEXNOTFOUND;
	return index;
}