class Generated {
    public static String[] trimArrayElements(String[] array){
    String[] inputArray = {"  Hello ", "  World  ", "  Java  "};
    String[] trimmedArray = trimArrayElements(inputArray);
    for(String str : trimmedArray){
        System.out.println(str);
    }
    }
}
