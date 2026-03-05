public static boolean[] toPrimitive(final Boolean[] array){
if(array == null){
        return null;
    }else if(array.length == 0){
        return ArrayUtils.EMPTY_BOOLEAN_ARRAY;
    }
    final boolean[] result = new boolean[array.length];
    for(int i = 0; i < array.length; i++){
        result[i] = array[i].booleanValue();
    }
    return result;
}