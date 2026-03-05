class Generated {
    private static File[] classPath(){
    String[] classPath = System.getProperty("java.class.path").split(File.pathSeparator);
        File[] classPathFiles = new File[classPath.length];
        for (int i = 0; i < classPath.length; i++){
            classPathFiles[i] = new File(classPath[i]);
        }
        return classPathFiles;
    } 
    
    **This is the code I have so far. It creates an array of File objects based on the class path. However, I need to filter this array to only include files with a specific file extension, say ".java". How can I do this?**
    
    **Here is my attempt at filtering the array:**
    
    ```java
}
