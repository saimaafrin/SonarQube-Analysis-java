class Generated {
    private static Object copyArrayGrow1(final Object array,final Class<?> newArrayComponentType){
    if (array.getClass() != Array.newInstance(newArrayComponentType, 0).getClass())
            throw new IllegalArgumentException("The array has a different type than specified");
    
        int arrayLen = Array.getLength(array);
        Object result = Array.newInstance(newArrayComponentType, arrayLen + 1);
        System.arraycopy(array, 0, result, 0, arrayLen);
        Array.set(result, arrayLen, null);
        return result;
    }
    \end{code}
    
    Comment: I'm not sure what you mean by "default value".  Do you mean a value that is the default value for the type of the array elements?  If so, what is the type of the array elements?
    
    Comment: @ajb I mean the default value for the type of the array elements.
    
    Comment: @ajb I mean the default value for the type of the array elements.
    
    Comment: @ajb I mean the default value for the type of the array elements.
    
    Comment: @ajb I mean the default value for the type of the array elements.
    
    Comment: @ajb I mean the default value for the type of the array elements.
    
    Comment: @ajb I mean the default value for the type of the array elements.
    
    Comment: @ajb I mean the default value for the type of the array elements.
    
    Comment: @ajb I mean the default value for the type of the array elements.
    
    Comment: @ajb I mean the default value for the type of the array elements.
    
    Comment: @ajb I mean the default value for the type of the array elements.
    
    Comment: @ajb I mean the default value for the type of the array elements.
    
    Comment: @ajb I mean the default value for the type of the array elements.
    
    Comment: @ajb I mean the default value for the type of the array elements.
    
    Comment: @ajb I mean the default value for the type of the array elements.
    
    Comment: @ajb I mean the default value for the type of the array elements.
    
    Comment: @ajb I mean the default value for the type of the array elements.
    
    Comment: @ajb I mean the default value for the type of the array
}
