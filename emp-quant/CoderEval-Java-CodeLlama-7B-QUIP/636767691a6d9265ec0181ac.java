public static String applyRelativePath(String path,String relativePath){
String newPath=path.substring(0,path.lastIndexOf(FOLDER_SEPARATOR));
    if(newPath.length()==0){
        newPath=FOLDER_SEPARATOR;
    }
    newPath=newPath+FOLDER_SEPARATOR+relativePath;
    if(relativePath.endsWith(FOLDER_SEPARATOR)){
        newPath=newPath+FOLDER_SEPARATOR;
    }
    return newPath;
}