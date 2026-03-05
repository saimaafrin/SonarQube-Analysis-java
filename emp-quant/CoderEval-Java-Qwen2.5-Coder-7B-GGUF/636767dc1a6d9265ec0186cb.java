class Generated {
    public void init(){
    // Create a new directory
        File dir = new File("myDirectory");
        if (!dir.exists()) {
            dir.mkdirs();
        }
    }
}
