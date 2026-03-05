public static String stripFilenameExtension(String path){
int lastDotIndex = path.lastIndexOf('.');  
    if(lastDotIndex == -1){  
        return path;  
    }  
    return path.substring(0, lastDotIndex);  
}