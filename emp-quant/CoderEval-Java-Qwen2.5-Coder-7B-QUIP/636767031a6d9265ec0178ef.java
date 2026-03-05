class Generated {
    private static Object copyArrayGrow1(final Object array,final Class<?> newArrayComponentType){
    final Object[] original = (Object[]) array;  
        final Object[] copy = (Object[]) Array.newInstance(newArrayComponentType, original.length + 1);  
        System.arraycopy(original, 0, copy, 0, original.length);  
        return copy;  
    }  
    
    **Copy the given array and add a default value at the end.**
}
