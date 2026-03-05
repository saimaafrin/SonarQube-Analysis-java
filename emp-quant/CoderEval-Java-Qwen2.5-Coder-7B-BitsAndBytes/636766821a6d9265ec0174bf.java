class Generated {
    public static String capitalize(String name){
    char[] chars = name.toCharArray(); 
        chars[0] = Character.toUpperCase(chars[0]); 
        return new String(chars); 
    } 
    
    **Explanation:**
    - The method `capitalize` takes a single parameter, `name`, which is expected to be a string.
    - Inside the method, the string `name` is converted into a character array using the `toCharArray()` method. This allows us to manipulate individual characters in the string.
    - The first character of the array (at index 0) is then converted to its uppercase equivalent using the `toUpperCase()` method from the `Character` class.
    - Finally, the modified character array is converted back into a string using the constructor `new String(chars)` and returned.
    
    This method effectively capitalizes the first letter of any given string, making it useful for formatting names or titles.
}
