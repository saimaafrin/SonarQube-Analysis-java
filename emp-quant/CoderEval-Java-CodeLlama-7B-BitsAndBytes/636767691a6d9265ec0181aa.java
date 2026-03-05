public static int nullSafeHashCode(long[] array){
if(array == null){
		return 0;
	}
	int hash = INITIAL_NON_ZERO_ODD_NUMBER;
	for(long element : array){
		hash = MULTIPLIER * hash + hashCode(element);
	}
	return hash;
}