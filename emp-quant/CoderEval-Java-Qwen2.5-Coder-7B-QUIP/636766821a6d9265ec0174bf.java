public static String capitalize(String name){
char[] nameArray = name.toCharArray(); 
    nameArray[0] = Character.toUpperCase(nameArray[0]); 
    return new String(nameArray); 
}