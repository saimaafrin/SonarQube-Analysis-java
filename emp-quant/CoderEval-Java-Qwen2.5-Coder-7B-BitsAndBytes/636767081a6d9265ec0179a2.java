class Generated {
    private static boolean isAllZeros(String s){
    for(int i=0; i<s.length(); i++){  
            if(s.charAt(i) != '0'){  
                return false;  
            }  
        }  
        return true;  
    }  
    
    **Explanation:**
    The function `isAllZeros` checks if every character in the input string `s` is the digit '0'. It iterates through each character of the string using a for loop. If it finds any character that is not '0', it immediately returns `false`. If the loop completes without finding any non-'0' characters, it returns `true`, indicating that the string consists entirely of zeros.
    
    This function assumes that the input string contains only numeric characters and does not handle cases where the string might contain other types of characters or be empty.
}
