class Generated {
    public static boolean isSameLength(final byte[] array1,final byte[] array2){
    if(array1==null && array2==null){
    		return true;
    	}
    	if(array1==null || array2==null){
    		return false;
    	}
    	return array1.length==array2.length;
    }
}
