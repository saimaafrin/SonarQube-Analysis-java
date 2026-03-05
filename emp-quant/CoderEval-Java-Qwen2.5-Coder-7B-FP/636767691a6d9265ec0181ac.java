public static String applyRelativePath(String path,String relativePath){
int folderIndex=path.indexOf(FOLDER_SEPARATOR);  
    if(folderIndex==-1){  
        throw new IllegalArgumentException("Invalid path: "+path);  
    }  
    return path.substring(0,folderIndex+1)+relativePath;  
}