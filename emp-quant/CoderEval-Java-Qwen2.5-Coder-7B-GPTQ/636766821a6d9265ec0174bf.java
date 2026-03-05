class Generated {
    public static String capitalize(String name){
    char[] ch = name.toCharArray();  
        if(ch[0] >= 'a' && ch[0] <= 'z'){  
            ch[0] = (char)(ch[0] - 32);  
        }  
        return new String(ch);  
    }  
    
    **Explanation:**
    - The function `capitalize` takes a single parameter `name`, which is expected to be a string.
    - Inside the function, the string `name` is converted into a character array using the `toCharArray()` method. This allows individual characters to be accessed and modified.
    - The condition checks if the first character (`ch[0]`) is a lowercase letter by comparing its ASCII value between 'a' and 'z'.
    - If it is a lowercase letter, it is converted to an uppercase letter by subtracting 32 from its ASCII value.
    - Finally, the modified character array is converted back into a string using the `new String(ch)` constructor and returned.
    
    This function effectively capitalizes the first letter of a given string while leaving the rest of the characters unchanged.
}
