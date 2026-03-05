class Generated {
    public static String[] split(String toSplit,String delimiter){
    int index=toSplit.indexOf(delimiter);
    	if(index==-1){
    		return new String[]{toSplit,null};
    	}
    	return new String[]{toSplit.substring(0,index),toSplit.substring(index+1)};
    }
}
