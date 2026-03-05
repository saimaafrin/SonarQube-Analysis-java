class Generated {
    public static String[] trimArrayElements(String[] array){
    for(int i=0; i<array.length; i++){
            array[i] = array[i].trim();
        }
        return array;
    }
}
