public static Double[] nullToEmpty(final Double[] array){
if (array == null || array.length == 0) {  
        return EMPTY_CHARACTER_OBJECT_ARRAY;  
    }  
    return array;  
}  

**If the double type array is null or its length is 0, convert array to EMPTY_CHARACTER_OBJECT_ARRAY. Otherwise, return array itself.**