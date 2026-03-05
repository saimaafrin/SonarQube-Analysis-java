public static String[] trimArrayElements(String[] array){
// Your code here

return Arrays.stream(array).map(String::trim).toArray(String[]::new);
}