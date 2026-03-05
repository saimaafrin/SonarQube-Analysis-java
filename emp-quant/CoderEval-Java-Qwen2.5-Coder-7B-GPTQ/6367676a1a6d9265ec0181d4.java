public static String[] addStringToArray(String[] array,String str){
//Create a new array with one more element than the original array
    String[] newArray = new String[array.length + 1];  
    //Copy elements from the original array to the new array
    for(int i=0;i<array.length;i++){  
        newArray[i] = array[i];  
    }  
    //Add the new string to the end of the new array
    newArray[newArray.length - 1] = str;  
    return newArray;  
}