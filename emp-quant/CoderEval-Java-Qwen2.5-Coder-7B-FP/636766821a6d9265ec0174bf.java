public static String capitalize(String name){
char[] chars = name.toCharArray(); 
    chars[0] = Character.toUpperCase(chars[0]); 
    return new String(chars); 
} 

**Explanation:**
- The `toCharArray()` method is used to convert the input string into a character array.
- The first element of the character array (index 0) is converted to uppercase using `Character.toUpperCase()`.
- A new string is created from the modified character array, which now has its first letter capitalized.

This function can be useful for formatting names or titles in applications where consistent capitalization is required.