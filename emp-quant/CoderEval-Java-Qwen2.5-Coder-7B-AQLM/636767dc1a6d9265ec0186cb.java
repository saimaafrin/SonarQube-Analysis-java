class Generated {
    public void init(){
    // Create a new directory
        File dir = new File("myDirectory");
        if (!dir.exists()) {
            dir.mkdir();
            System.out.println("Directory created successfully.");
        } else {
            System.out.println("Directory already exists.");
        }
    }
}
