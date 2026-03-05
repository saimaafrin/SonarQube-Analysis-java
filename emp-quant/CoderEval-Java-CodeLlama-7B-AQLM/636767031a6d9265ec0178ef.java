class Generated {
    private static Object copyArrayGrow1(final Object array,final Class<?> newArrayComponentType){
    if(array==null){
    		return null;
    	}
    	final int arrayLength=Array.getLength(array);
    	final Object newArray=Array.newInstance(newArrayComponentType,arrayLength+1);
    	for(int i=0;i<arrayLength;i++){
    		Array.set(newArray, i, Array.get(array, i));
    	}
    	return newArray;
    }
}
