public static int nullSafeHashCode(long[] array){
if(array == null){
		return 0;
	}
	int hash = 1;
	for(long element : array){
		hash = MULTIPLIER * hash + (element == null ? 0 : element.hashCode());
	}
	return hash;
}