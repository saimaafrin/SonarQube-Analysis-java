class Generated {
    public static int[] toPrimitive(final Integer[] array){
    if(array == null){
            return null;
        }
        int[] primitive = new int[array.length];
        for(int i = 0; i < array.length; i++){
            primitive[i] = array[i].intValue();
        }
        return primitive;
    }
}
