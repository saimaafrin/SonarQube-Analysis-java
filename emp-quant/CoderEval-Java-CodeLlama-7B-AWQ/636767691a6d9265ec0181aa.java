class Generated {
    public static int nullSafeHashCode(long[] array){
    if(array == null){
    		return 0;
    	}
    	int hashCode = 1;
    	for(long element : array){
    		hashCode = MULTIPLIER * hashCode + element;
    	}
    	return hashCode;
    }
}
