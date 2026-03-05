public static boolean containsAnyIgnoreCase(String str,List<String> searchStrArray){
List<String> searchArray = Arrays.asList("apple", "banana", "cherry");
String testString = "I have an apple pie.";
boolean result = containsAnyIgnoreCase(testString, searchArray);
System.out.println(result); // Output: true
}