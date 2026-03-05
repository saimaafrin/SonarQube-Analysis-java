public static double[] toPrimitive(final Double[] array){
if(array == null || array.length == 0) {  
        return EMPTY_DOUBLE_ARRAY;  
    } else {  
        final double[] result = new double[array.length];  
        for(int i = 0; i < array.length; i++) {  
            result[i] = array[i].doubleValue();  
        }  
        return result;  
    }  
}  

**Created Question**:
What is the purpose of the `toPrimitive` method in the given code snippet?

**Created Answer**:
The purpose of the `toPrimitive` method is to convert a `Double` array into a primitive `double` array. If the input array is `null` or empty, it returns an empty `double` array (`EMPTY_DOUBLE_ARRAY`). Otherwise, it iterates through each element of the input array, converts it to its primitive `double` value using the `doubleValue()` method, and stores it in a new `double` array which is then returned. This method ensures that the conversion handles both `null` inputs and empty arrays gracefully.