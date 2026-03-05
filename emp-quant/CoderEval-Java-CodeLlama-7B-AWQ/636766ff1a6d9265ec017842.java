public static double[] toPrimitive(final Double[] array){
if(array.length == 0) return EMPTY_DOUBLE_ARRAY;
    final double[] primitive = new double[array.length];
    for(int i = 0; i < array.length; i++) primitive[i] = array[i];
    return primitive;
}