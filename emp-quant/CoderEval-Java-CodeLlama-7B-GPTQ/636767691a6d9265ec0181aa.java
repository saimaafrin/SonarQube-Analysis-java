class Generated {
    public static int nullSafeHashCode(long[] array){
    if(array == null){
    		return 0;
    	}
    	int hash = 1;
    	for(long element : array){
    		hash = MULTIPLIER * hash + element;
    	}
    	return hash;
    }
}
