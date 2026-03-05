class Generated {
    public static String[] addStringToArray(String[] array,String str){
    String[] newArray = new String[array.length+1];
        for(int i=0;i<array.length;i++){
            newArray[i] = array[i];
        }
        newArray[newArray.length-1] = str;
        return newArray;
    }
}
