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
- The function `copyStrings` takes an array of strings as input.
- It first checks if the input array is null, and if so, it returns null.
- It then calculates the length of the input array.
- A new array of strings (`dest`) is created with the same length as the input array.
- Using a for loop, each element of the input array is converted to lowercase using the `toLowerCase()` method and stored in the corresponding position in the destination array.
- Finally, the destination array is returned.

This function effectively copies the input array while converting all characters to lowercase, ensuring that the output array contains only lowercase strings.