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
The function `copyStrings` takes an array of strings as input (`src`). It first checks if the input array is null, in which case it returns null. If not, it creates a new array `dest` of the same length as `src`. Then, it iterates through each element of `src`, converts it to lowercase using the `toLowerCase()` method, and assigns it to the corresponding position in `dest`. Finally, it returns the newly created array `dest`.

This function is useful when you need to process or store a copy of a list of strings where all characters are in lowercase, without modifying the original data.