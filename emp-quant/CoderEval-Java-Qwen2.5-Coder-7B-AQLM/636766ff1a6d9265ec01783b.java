public static String sub(String str,int start,int end){
if(str==null){  
        return null;  
    }  
    if(start<0){  
        start=0;  
    }  
    if(end>str.length()){  
        end=str.length();  
    }  
    return str.substring(start,end);  
}  

**Explanation**:
The function `sub` is designed to safely extract a substring from a given string `str` between the indices `start` and `end`. It handles potential exceptions by checking if the string is null or if the indices are out of bounds. If the string is null, it returns null. If the start index is negative, it is set to 0 to avoid an `IndexOutOfBoundsException`. If the end index exceeds the length of the string, it is set to the length of the string to ensure the substring does not exceed the string's bounds. Finally, it returns the substring using the `substring` method of the String class. This function ensures safe substring extraction without throwing exceptions.