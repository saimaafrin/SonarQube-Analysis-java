public static boolean isEmpty(final double[] array){
if (array == null) {
        throw new IllegalArgumentException("Null array");
    }
    return array.length == 0;
}