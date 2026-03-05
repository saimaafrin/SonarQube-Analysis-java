public void init(){
// Create the directory if it doesn't exist
    File dir = new File("myDirectory");
    if (!dir.exists()) {
        dir.mkdirs();
    }
}

**/Reads a file from the directory.**/