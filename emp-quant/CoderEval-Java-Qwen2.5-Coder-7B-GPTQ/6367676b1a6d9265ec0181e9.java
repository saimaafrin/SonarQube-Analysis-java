class Generated {
    public static boolean substringMatch(CharSequence str,int index,CharSequence substring){
    int len1=str.length();  
        int len2=substring.length();  
        if(index<0||index+len2>len1)  
            return false;  
        for(int i=index;i<index+len2;i++)  
            if(str.charAt(i)!=substring.charAt(i-index))  
                return false;  
        return true;  
    }  
    
    **Explanation:**
    The function `substringMatch` checks whether a given substring matches with a part of the main string starting from a specified index.
    
    Here's how it works:
    
    - It first calculates the lengths of both the main string (`str`) and the substring (`substring`).
    - Then, it checks if the provided index is within the valid range (i.e., not negative and less than or equal to the length of the main string minus the length of the substring). If not, it returns `false`.
    - Next, it iterates over each character in the substring by comparing it with the corresponding character in the main string starting from the given index.
    - If any characters do not match, it immediately returns `false`.
    - If all characters match, it returns `true`, indicating that the substring matches the part of the main string starting from the given index.
}
