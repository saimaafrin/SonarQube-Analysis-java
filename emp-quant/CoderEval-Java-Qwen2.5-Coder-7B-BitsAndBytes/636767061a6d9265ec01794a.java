public static int indexOfExtension(String filename){
String filename = "example.txt";
int lastIndex = indexOfExtension(filename);
System.out.println(lastIndex); // Output: 7

filename = "example.";
lastIndex = indexOfExtension(filename);
System.out.println(lastIndex); // Output: 7

filename = "example..txt";
lastIndex = indexOfExtension(filename);
System.out.println(lastIndex); // Output: 8

filename = "example\\txt";
lastIndex = indexOfExtension(filename);
System.out.println(lastIndex); // Output: -1
}