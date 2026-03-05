class Generated {
    public static int countOccurrencesOf(String str,String sub){
    if(str==null||sub==null) return 0;  
        int count=0;  
        for(int i=0;i<str.length()-sub.length()+1;i++){  
            if(str.substring(i,i+sub.length()).equals(sub)) count++;  
        }  
        return count;  
    }  
    
    **Explanation:**
    The function `countOccurrencesOf` takes two parameters, a string `str` and a substring `sub`. It returns the number of times the substring appears in the string.
    
    Here's how it works:
    - The function first checks if either `str` or `sub` is null. If so, it returns 0 because there can't be any occurrences.
    - It initializes a counter variable `count` to 0.
    - Then, it iterates over the string using a for loop. For each position `i`, it checks if the substring from `i` to `i + sub.length()` is equal to `sub`.
    - If they are equal, it increments the counter `count`.
    - After the loop finishes, it returns the value of `count`.
    
    This function counts overlapping occurrences as well. For example, `countOccurrencesOf("ababa", "aba")` will return 2 because "aba" appears twice in "ababa".
}
