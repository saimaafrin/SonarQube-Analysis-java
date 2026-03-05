class Generated {
    public static boolean substringMatch(CharSequence str,int index,CharSequence substring){
    int n = str.length();  
        int m = substring.length();  
        if(n < index + m) return false;  
        for(int i = 0;i < m;i++){  
            if(str.charAt(index + i) != substring.charAt(i)) return false;  
        }  
        return true;  
    }  
    
    **Explanation:**
    The function `substringMatch` checks if a given substring matches a part of another string starting from a specified index. Here's how it works:
    
    1. **Length Check**: The function first checks if the length of the main string (`str`) is less than the sum of the starting index and the length of the substring (`m`). If this condition is true, it means the substring cannot fit in the remaining part of the main string, so it returns `false`.
    
    2. **Character Comparison**: If the initial length check passes, the function then iterates through each character of the substring. For each character, it compares it with the corresponding character in the main string starting from the given index.
    
    3. **Return Result**: If any character does not match, the function immediately returns `false`. If all characters match, it returns `true`, indicating that the substring matches the part of the main string starting from the given index.
}
