public static String capitalize(String name){
char[] charArray = name.toCharArray();  
    charArray[0] = Character.toUpperCase(charArray[0]);  
    return new String(charArray);  
}  

**Converts a string to a character array and converts all letters to uppercase.**