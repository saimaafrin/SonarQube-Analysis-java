class Generated {
    public static Integer[] toObject(final int[] array){
    Integer[] result = new Integer[array.length];  
        for (int i = 0; i < array.length; i++) {  
            result[i] = Integer.valueOf(array[i]);  
        }  
        return result;  
    }
}
