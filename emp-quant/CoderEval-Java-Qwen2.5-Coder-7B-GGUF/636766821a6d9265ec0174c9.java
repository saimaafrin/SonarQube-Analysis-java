class Generated {
    private static File[] classPath(){
    String classPath = System.getProperty("java.class.path");
        String[] classPathArray = classPath.split(File.pathSeparator);
        File[] classPathFiles = new File[classPathArray.length];
        for(int i = 0; i < classPathArray.length; i++){
            classPathFiles[i] = new File(classPathArray[i]);
        }
        return classPathFiles;
    }
}
