class Generated {
    public static int lastIndexOf(String str,String searchStr){
    int index = -1;
    	int searchStrLen = searchStr.length();
    	int strLen = str.length();
    	for(int i = strLen - 1; i >= 0; i--){
    		if(str.charAt(i) == searchStr.charAt(0)){
    			int j = i + 1;
    			for(int k = 1; k < searchStrLen; k++){
    				if(str.charAt(j) != searchStr.charAt(k)){
    					break;
    				}
    				j++;
    			}
    			if(j == i + searchStrLen){
    				index = i;
    				break;
    			}
    		}
    	}
    	return index;
    }
}
