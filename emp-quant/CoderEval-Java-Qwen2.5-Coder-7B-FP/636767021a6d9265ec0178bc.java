public static int indexOf(String str,String searchStr){
if(str==null||searchStr==null) return -1;  
    for(int i=0;i<str.length()-searchStr.length()+1;i++){  
        boolean found=true;  
        for(int j=0;j<searchStr.length();j++){  
            if(str.charAt(i+j)!=searchStr.charAt(j)){  
                found=false;  
                break;  
            }  
        }  
        if(found) return i;  
    }  
    return -1;  
}  

**Explanation:**
The function `indexOf` takes two parameters, a string `str` and a substring `searchStr`. It returns the first index at which `searchStr` is found within `str`, or `-1` if `searchStr` is not found.

Here's how it works:
1. **Null Check**: The function first checks if either `str` or `searchStr` is `null`. If so, it immediately returns `-1`.
2. **Outer Loop**: The outer loop iterates over each possible starting position in `str` where `searchStr` could fit. This loop runs from `0` to `str.length() - searchStr.length() + 1`.
3. **Inner Loop**: For each starting position, the inner loop checks if the characters of `searchStr` match the corresponding characters in `str` starting from the current position.
4. **Found Flag**: A boolean flag `found` is used to track whether all characters match. If any character does not match, `found` is set to `false` and the inner loop breaks.
5. **Return Index**: If all characters match (`found` remains `true`), the function returns the current starting index `i`.
6. **Not Found**: If no matching position is found after checking all possibilities, the function returns `-1`.

This implementation ensures that the function correctly identifies the first occurrence of `searchStr` in `str` by comparing each character individually.