public static String applyRelativePath(String path,String relativePath){
int prefixEnd=path.indexOf(FOLDER_SEPARATOR);
    if(prefixEnd==-1){
        prefixEnd=path.length();
    }
    String newPath=path.substring(0,prefixEnd)+relativePath;
    if(newPath.length()>1&&newPath.endsWith(FOLDER_SEPARATOR)){
        newPath=newPath.substring(0,newPath.length()-1);
    }
    return newPath;
}