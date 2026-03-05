class Generated {
    public static double[] toPrimitive(final Double[] array){
    if(array.length == 0){
            return EMPTY_DOUBLE_ARRAY;
        }
        return Arrays.stream(array).mapToDouble(Double::doubleValue).toArray();
    }
}
