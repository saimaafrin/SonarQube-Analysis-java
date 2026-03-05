class Generated {
    public static int indexOf(String str,String searchStr){
    if(str==null||searchStr==null) return -1;  
        for(int i=0;i<=str.length()-searchStr.length();i++){  
            boolean flag=true;  
            for(int j=0;j<searchStr.length();j++){  
                if(str.charAt(i+j)!=searchStr.charAt(j)){  
                    flag=false;  
                    break;  
                }  
            }  
            if(flag) return i;  
        }  
        return -1;  
    }  
    
    **Explanation:**
    The function `indexOf` takes two parameters, a string `str` and a substring `searchStr`. It returns the first index at which `searchStr` is found within `str`, or `-1` if `searchStr` is not found.
    
    Here's how it works:
    - The function first checks if either `str` or `searchStr` is null. If so, it returns `-1`.
    - It then iterates through `str` using an outer loop that runs from `0` to `str.length() - searchStr.length()`. This ensures that we don't go out of bounds when checking substrings.
    - For each position `i` in `str`, it initializes a boolean variable `flag` to `true`.
    - An inner loop checks each character of `searchStr` against the corresponding character in `str` starting from position `i`.
    - If any characters do not match, `flag` is set to `false` and the inner loop breaks.
    - If all characters match (i.e., `flag` remains `true`), the function returns the current index `i`.
    - If no matches are found after iterating through `str`, the function returns `-1`.
    
    This implementation provides a straightforward way to find the first occurrence of a substring within a string.
}
