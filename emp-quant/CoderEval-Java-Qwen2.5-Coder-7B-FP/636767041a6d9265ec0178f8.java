private static String[] copyStrings(final String[] src){
if(src == null) return null;  
    final int len = src.length;  
    final String[] dest = new String[len];  
    for(int i=0;i<len;i++){  
        dest[i] = src[i].toLowerCase();  
    }  
    return dest;  
}  

**Explanation:**
The function `copyStrings` takes an array of strings as input and returns a new array where each string is converted to lowercase. The function first checks if the input array is null, in which case it returns null. It then creates a new array of the same length as the input array. For each element in the input array, it converts the string to lowercase using the `toLowerCase()` method and assigns it to the corresponding position in the new array. Finally, it returns the new array containing the lowercase versions of the original strings.