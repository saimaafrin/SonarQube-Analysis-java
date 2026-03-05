public static String applyRelativePath(String path,String relativePath){
int separatorIndex=path.lastIndexOf(FOLDER_SEPARATOR);
    if(separatorIndex==-1){
        separatorIndex=path.length();
    }
    String newPath=path.substring(0,separatorIndex);
    if(!relativePath.startsWith(FOLDER_SEPARATOR)){
        newPath+=FOLDER_SEPARATOR;
    }
    newPath+=relativePath;
    return cleanPath(newPath);
}