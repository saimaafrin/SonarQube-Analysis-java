class Generated {
    public static String applyRelativePath(String path,String relativePath){
    if(path==null||path.isEmpty()){  
            throw new IllegalArgumentException("The path must not be null or empty");  
        }  
        if(relativePath==null){  
            throw new IllegalArgumentException("The relative path must not be null");  
        }  
        int folderSeparatorIndex=path.lastIndexOf(FOLDER_SEPARATOR);  
        if(folderSeparatorIndex==-1){  
            throw new IllegalArgumentException("The path does not contain the folder separator: "+FOLDER_SEPARATOR);  
        }  
        String basePath=path.substring(0,folderSeparatorIndex+1);  
        return basePath+relativePath;  
    }
}
