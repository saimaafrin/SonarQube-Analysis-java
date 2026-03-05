class Generated {
    private static Object copyArrayGrow1(final Object array,final Class<?> newArrayComponentType){
    if(array==null){
            return null;
        }
        final int len=Array.getLength(array);
        final Object newArray=Array.newInstance(newArrayComponentType,len+1);
        for(int i=0;i<len;i++){
            Array.set(newArray,i,Array.get(array,i));
        }
        return newArray;
    }
}
