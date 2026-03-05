private static File[] classPath(){
String[] classPath = System.getProperty("java.class.path").split(":");
    File[] files = new File[classPath.length];
    for(int i = 0; i < classPath.length; i++){
        files[i] = new File(classPath[i]);
    }
    return files;
}