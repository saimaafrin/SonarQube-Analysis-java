class Generated {
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
    - The function first checks if either `str` or `searchStr` is null. If so, it returns `-1`.
    - It then iterates through `str` using an outer loop that starts from the beginning of `str` and goes up to the point where there is enough space left in `str` for `searchStr` to fit.
    - For each position in `str`, it uses an inner loop to compare characters between `str` and `searchStr` starting from the current position in `str`.
    - If all characters match, it returns the current index as the start of the occurrence of `searchStr`.
    - If no matches are found after checking all possible positions, it returns `-1`.
    
    This method ensures that the function correctly identifies the first occurrence of `searchStr` within `str`.
}
