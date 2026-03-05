class Generated {
    public static int countOccurrencesOf(String str,String sub){
    if(str == null || sub == null) return 0;  
        int count = 0;  
        int fromIndex = 0;  
        while(fromIndex != -1){  
            fromIndex = str.indexOf(sub,fromIndex);  
            if(fromIndex != -1){  
                count++;  
                fromIndex += sub.length();  
            }  
        }  
        return count;  
    }  
    
    **Explanation:**
    The function `countOccurrencesOf` takes two parameters: a string `str` and a substring `sub`. It returns the number of times the substring appears in the string.
    
    Here's how it works:
    - The function first checks if either `str` or `sub` is `null`. If so, it returns 0 because there can't be any occurrences.
    - It initializes a counter `count` to 0 and a variable `fromIndex` to 0. `fromIndex` will keep track of where to start searching for the next occurrence of the substring.
    - Inside a `while` loop, it uses the `indexOf` method to find the index of the substring starting from `fromIndex`.
    - If `indexOf` returns `-1`, it means the substring was not found, and the loop ends.
    - If the substring is found, it increments the `count` by 1 and updates `fromIndex` to the position right after the current occurrence of the substring (to ensure overlapping substrings are counted).
    - Finally, the function returns the total count of occurrences.
}
