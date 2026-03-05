class Generated {
    public static boolean toBoolean(String value,boolean dEfault){
    String input = "  True ";
    boolean result = toBoolean(input, false);
    System.out.println(result); // Output: true
    
    input = "false";
    result = toBoolean(input, true);
    System.out.println(result); // Output: false
    
    input = null;
    result = toBoolean(input, true);
    System.out.println(result); // Output: true
    }
}
