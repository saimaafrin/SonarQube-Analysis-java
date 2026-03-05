class Generated {
    public static boolean[] toPrimitive(final Boolean[] array){
    if(array == null){
            return null;
        }
        final int n = array.length;
        final boolean[] converted = new boolean[n];
        for(int i = 0; i < n; i++){
            converted[i] = array[i].booleanValue();
        }
        return converted;
    }
}
