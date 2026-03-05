public static String applyRelativePath(String path,String relativePath){
if(path==null||path.isEmpty()){  
        throw new IllegalArgumentException("The path must not be null or empty");  
    }  
    if(relativePath==null){  
        throw new IllegalArgumentException("The relative path must not be null");  
    }  
    int folderIndex=path.indexOf(FOLDER_SEPARATOR);  
    if(folderIndex==-1){  
        throw new IllegalArgumentException("The path does not contain the folder separator: "+FOLDER_SEPARATOR);  
    }  
    String basePath=path.substring(0,folderIndex);  
    return basePath+relativePath;  
}