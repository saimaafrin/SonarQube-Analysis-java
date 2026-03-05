class Generated {
    public static Boolean[] nullToEmpty(final Boolean[] array){
    if(array == null || array.length == 0){
            return new Boolean[0];
        }
        return array;
    }
    
    **Return an EMPTY_BOOLEAN_OBJECT_ARRAY array for a null or empty input array.**  
    This method checks if the input array is either null or empty. If either condition is true, it returns an empty Boolean array. Otherwise, it returns the original array. This is useful for ensuring that operations on the array are performed on a valid, non-empty array.
}
