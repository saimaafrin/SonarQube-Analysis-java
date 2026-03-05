class Generated {
    public static String[] concatenateStringArrays(String[] array1,String[] array2){
    // Create a new array with the combined length of array1 and array2
        String[] combinedArray = new String[array1.length + array2.length];
        
        // Copy elements from array1 to the combinedArray
        for (int i = 0; i < array1.length; i++) {
            combinedArray[i] = array1[i];
        }
        
        // Copy elements from array2 to the combinedArray
        for (int i = 0; i < array2.length; i++) {
            combinedArray[i + array1.length] = array2[i];
        }
        
        // Return the combined array
        return combinedArray;
    }
}
