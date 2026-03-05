public static String capitalize(String name){
char[] chars = name.toCharArray(); 
    chars[0] = Character.toUpperCase(chars[0]); 
    return new String(chars); 
} 

**This function takes a string as input, converts it into a character array, capitalizes the first letter, and then returns the modified string. This is useful for formatting names or titles where proper noun capitalization is required.**