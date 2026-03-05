class Generated {
    public static String[] trimArrayElements(String[] array){
    String[] trimmedArray = new String[array.length];
        for(int i = 0; i < array.length; i++){
            trimmedArray[i] = array[i].trim();
        }
        return trimmedArray;
    }
}
