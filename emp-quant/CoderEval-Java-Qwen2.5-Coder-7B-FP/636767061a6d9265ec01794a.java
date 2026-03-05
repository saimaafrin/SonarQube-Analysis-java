class Generated {
    public static int indexOfExtension(String filename){
    String filename = "example.txt";
    int result = indexOfExtension(filename);
    System.out.println(result); // Output: 7
    
    filename = "example.";
    result = indexOfExtension(filename);
    System.out.println(result); // Output: 7
    
    filename = "example..txt";
    result = indexOfExtension(filename);
    System.out.println(result); // Output: 8
    
    filename = "/path/to/example.txt";
    result = indexOfExtension(filename);
    System.out.println(result); // Output: -1
    
    filename = "example.txt/";
    result = indexOfExtension(filename);
    System.out.println(result); // Output: -1
    }
}
