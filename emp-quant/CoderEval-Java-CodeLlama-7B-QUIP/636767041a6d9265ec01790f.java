public static Integer[] toObject(final int[] array){
if(array==null)
		return null;
	final Integer[] result = new Integer[array.length];
	for(int i=0;i<array.length;i++)
		result[i]=new Integer(array[i]);
	return result;
}