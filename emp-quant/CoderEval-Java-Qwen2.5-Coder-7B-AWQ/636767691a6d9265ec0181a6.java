public static String[] split(String toSplit,String delimiter){
int index = toSplit.indexOf(delimiter);  
    if(index == -1) {  
        return new String[]{toSplit,""};  
    } else {  
        return new String[]{toSplit.substring(0,index),toSplit.substring(index+delimiter.length())};  
    }  
}  

**Explanation:**
- The function `split` takes two parameters: a string `toSplit` and a delimiter.
- It uses the `indexOf` method to find the first occurrence of the delimiter in the string.
- If the delimiter is not found (`index == -1`), it returns an array containing the original string and an empty string.
- If the delimiter is found, it splits the string into two parts:
  - The part before the delimiter (using `substring(0, index)`).
  - The part after the delimiter (using `substring(index + delimiter.length())`).
- These two parts are returned as an array.

This function effectively handles splitting a string at its first occurrence of a specified delimiter.