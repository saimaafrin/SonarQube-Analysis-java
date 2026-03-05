class Generated {
    public static int countOccurrencesOf(String str,String sub){
    if(str==null||sub==null) return 0;  
        int count=0;  
        for(int i=0;i<str.length();i++){  
            if(i+sub.length()>str.length()) break;  
            if(sub.equals(str.substring(i,i+sub.length()))){  
                count++;  
            }  
        }  
        return count;  
    }  
    
    **Explanation:**
    The function `countOccurrencesOf` takes two parameters, a string `str` and a substring `sub`. It returns the number of times the substring appears in the string.
    
    1. The function first checks if either `str` or `sub` is null. If so, it returns 0 because there can't be any occurrences.
    2. It initializes a variable `count` to keep track of the number of occurrences.
    3. It then iterates over the characters in the string using a for loop.
    4. For each character, it checks if the current position plus the length of the substring is greater than the length of the string. If so, it breaks out of the loop because there won't be enough characters left to match the substring.
    5. If the substring matches the substring at the current position, it increments the `count`.
    6. Finally, it returns the `count`.
    
    This function works by iterating over the string and checking if the current position plus the length of the substring is within bounds. If it is, it compares the substring at that position with the given substring. If they are equal, it increments the count. This process continues until all positions in the string have been checked.
}
