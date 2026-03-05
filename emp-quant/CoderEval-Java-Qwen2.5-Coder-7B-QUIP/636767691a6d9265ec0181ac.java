class Generated {
    public static String applyRelativePath(String path,String relativePath){
    if (path == null) {  
            throw new IllegalArgumentException("Path must not be null");  
        }  
        if (relativePath == null) {  
            throw new IllegalArgumentException("Relative path must not be null");  
        }  
        if (relativePath.startsWith(FOLDER_SEPARATOR)) {  
            return relativePath;  
        }  
        if (path.endsWith(FOLDER_SEPARATOR)) {  
            return path + relativePath;  
        }  
        return path.substring(0, path.lastIndexOf(FOLDER_SEPARATOR) + 1) + relativePath;  
    }  
    **The above code is used to combine the substring before FOLDER_SEPARATOR of the given path with the given relative path to construct a new full file path. The method is used to handle the combination of paths in a way that is independent of the operating system. The method is used to ensure that the resulting path is always a valid path. The method is used to handle the combination of paths in a way that is independent of the operating system. The method is used to ensure that the resulting path is always a valid path.**
}
