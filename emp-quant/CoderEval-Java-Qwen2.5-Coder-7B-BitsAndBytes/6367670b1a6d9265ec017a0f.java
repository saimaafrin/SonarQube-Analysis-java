class Generated {
    public static boolean containsAnyIgnoreCase(String str,List<String> searchStrArray){
    List<String> searchStrings = Arrays.asList("apple", "banana", "cherry");
    boolean result = containsAnyIgnoreCase("I have an apple and a banana.", searchStrings);
    System.out.println(result); // Output: true
    }
}
