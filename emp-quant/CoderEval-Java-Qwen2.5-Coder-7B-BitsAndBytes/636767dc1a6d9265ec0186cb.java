public void init(){
// Create the root directory
    DirectoryEntry root = new DirectoryEntry();
    root.name = "/";
    root.isDirectory = true;
    root.parent = null;

    // Add the root to the directory structure
    directories.put("/", root);

    // Initialize other necessary structures or variables
    // ...
}