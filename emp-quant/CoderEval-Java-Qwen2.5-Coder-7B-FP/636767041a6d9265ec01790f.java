public static Integer[] toObject(final int[] array){
if (array == null) {  
        return null;  
    } else if (array.length == 0) {  
        return new Integer[0];  
    }  
    final Integer[] result = new Integer[array.length];  
    for (int i = 0; i < array.length; i++) {  
        result[i] = array[i];  
    }  
    return result;  
}