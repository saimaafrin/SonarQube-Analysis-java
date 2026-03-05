class Generated {
    public static double[] toPrimitive(final Double[] array){
    if (array.length == 0) {
            return EMPTY_DOUBLE_ARAY;
        }
        double[] result = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
}
