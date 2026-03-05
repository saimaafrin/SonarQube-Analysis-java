public static int indexOf(String str,String searchStr){
if(str==null||searchStr==null) return -1;  
    for(int i=0;i<=str.length()-searchStr.length();i++){  
        boolean isMatch=true;  
        for(int j=0;j<searchStr.length();j++){  
            if(str.charAt(i+j)!=searchStr.charAt(j)){  
                isMatch=false;  
                break;  
            }  
        }  
        if(isMatch)return i;  
    }  
    return -1;  
}  

**Explanation:**
The function `indexOf` takes two parameters, a string `str` and a substring `searchStr`. It returns the first index at which `searchStr` occurs in `str`, or `-1` if `searchStr` is not found.

Here's how it works:
1. The function checks if either `str` or `searchStr` is null. If so, it returns `-1`.
2. It then iterates through `str` using an outer loop from `0` to `str.length() - searchStr.length()`. This ensures that we don't go out of bounds when checking substrings.
3. For each position `i` in `str`, it initializes a boolean variable `isMatch` to `true`.
4. An inner loop compares each character of `searchStr` with the corresponding character in `str` starting from position `i`. If any characters do not match, `isMatch` is set to `false` and the inner loop breaks.
5. If `isMatch` remains `true` after the inner loop completes, it means `searchStr` has been found at position `i`, and the function returns `i`.
6. If no match is found after all iterations, the function returns `-1`.

This implementation provides a basic understanding of how string matching can be done manually without using built-in methods like `String.indexOf()`.