private static Object copyArrayGrow1(final Object array,final Class<?> newArrayComponentType){
if(array==null){
		return null;
	}
	final int s=Array.getLength(array);
	final Object newArray=Array.newInstance(array.getClass(),s+1);
	for(int i=0;i<s;i++){
		Array.set(newArray,i,Array.get(array,i));
	}
	Array.set(newArray,s,null);
	return newArray;
}