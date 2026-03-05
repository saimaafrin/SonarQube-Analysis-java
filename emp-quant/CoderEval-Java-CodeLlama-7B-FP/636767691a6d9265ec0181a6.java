public static String[] split(String toSplit,String delimiter){
int index = toSplit.indexOf(delimiter);
	if(index == -1){
		return new String[]{toSplit,""};
	}
	return new String[]{toSplit.substring(0,index),toSplit.substring(index+delimiter.length())};
}