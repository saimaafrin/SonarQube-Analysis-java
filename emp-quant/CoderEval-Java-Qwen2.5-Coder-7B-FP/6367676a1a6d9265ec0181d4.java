public static String[] addStringToArray(String[] array,String str){
//Create a new array with the size of the original array plus one
    String[] newArray = new String[array.length + 1];  
    //Copy all elements from the original array to the new array
    System.arraycopy(array,0,newArray,0,array.length);  
    //Add the new string to the end of the new array
    newArray[newArray.length - 1] = str;  
    return newArray;  
}  

**Explanation:**
This method `addStringToArray` takes two parameters: an array of strings (`array`) and a single string (`str`). It creates a new array that is one element larger than the original array. The `System.arraycopy` method is used to copy all elements from the original array to the new array. Finally, the new string is added to the last position of the new array, which is then returned. This effectively appends the string to the array.