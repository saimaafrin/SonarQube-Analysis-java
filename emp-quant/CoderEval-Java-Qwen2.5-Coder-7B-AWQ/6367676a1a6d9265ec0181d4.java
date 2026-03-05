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
This method takes an existing string array and a string as parameters. It creates a new array that is one element larger than the original array. It then copies all elements from the original array into the new array using `System.arraycopy()`. Finally, it adds the new string to the last position of the new array and returns this new array. This effectively appends the string to the array without modifying the original array.