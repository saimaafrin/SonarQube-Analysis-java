class Generated {
    private static Object copyArrayGrow1(final Object array,final Class<?> newArrayComponentType){
    int arrayLen=Array.getLength(array);
        Object newArray=Array.newInstance(newArrayComponentType,arrayLen+1);
        System.arraycopy(array,0,newArray,0,arrayLen);
        Array.set(newArray,arrayLen,null);
        return newArray;
    }
}
