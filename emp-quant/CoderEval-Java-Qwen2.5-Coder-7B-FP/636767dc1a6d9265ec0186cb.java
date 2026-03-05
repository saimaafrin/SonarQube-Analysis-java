public void init(){
// Create the root directory
    DirectoryEntry root = new DirectoryEntry();
    root.name = "/";
    root.isDirectory = true;
    root.parent = null;
    root.children = new ArrayList<>();
    
    // Add the root to the list of directories
    directories.add(root);
}

**DirectoryEntry Class:**
```java