public static String[] concatenateStringArrays(String[] array1,String[] array2){
// Create a new array with the combined length of both input arrays
    String[] result = new String[array1.length + array2.length];  

    // Copy elements from the first array to the result array
    System.arraycopy(array1, 0, result, 0, array1.length);  

    // Copy elements from the second array to the result array
    System.arraycopy(array2, 0, result, array1.length, array2.length);  

    return result;  
}