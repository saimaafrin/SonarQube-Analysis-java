public static int indexOfExtension(String filename){
if(filename == null) {  
        return -1;  
    }  
    int extensionPos = filename.lastIndexOf('.');  
    int dirSepPos = indexOfLastSeparator(filename);  
    return (dirSepPos > extensionPos ? -1 : extensionPos);  
}