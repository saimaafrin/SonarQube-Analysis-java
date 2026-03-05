private static File[] classPath(){
File[] classPath = new File[0];
    String[] files = System.getProperty("java.class.path").split(";");
    for(String file : files){
        File f = new File(file);
        if(f.exists()){
            classPath = ArrayUtils.add(classPath, f);
        }
    }
    return classPath;
}