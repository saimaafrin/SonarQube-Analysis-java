public static int indexOfExtension(String filename){
if(filename == null){  
        return -1;  
    }  
    int extensionIndex = filename.lastIndexOf('.');  
    int pathSeparatorIndex = filename.lastIndexOf(File.separator);  
    if(extensionIndex == -1 || pathSeparatorIndex > extensionIndex){  
        return -1;  
    }  
    return extensionIndex;  
}