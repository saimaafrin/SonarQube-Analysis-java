public static Short[] toObject(final short[] array){
if (array == null) { 
        return null; 
    } else if (array.length == 0) { 
        return new Short[0]; 
    }
    final Short[] result = new Short[array.length];
    for (int i = 0; i < array.length; i++) {
        result[i] = array[i];
    }
    return result;
}