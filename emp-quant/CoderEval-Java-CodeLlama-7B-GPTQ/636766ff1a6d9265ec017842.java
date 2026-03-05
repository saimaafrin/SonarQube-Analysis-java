public static double[] toPrimitive(final Double[] array){
if(array == null){
        return EMPTY_DOUBLE_ARRAY;
    }
    final int length = array.length;
    final double[] result = new double[length];
    for(int i = 0; i < length; i++){
        result[i] = array[i];
    }
    return result;
}