class Generated {
    public static int indexOfExtension(String filename){
    if(filename == null || filename.isEmpty()){  
            return -1;  
        }  
        // Find the last index of the file extension separator '.'  
        int extIndex = filename.lastIndexOf('.');  
        // Check if the extension separator is followed by a directory separator '/' or '\\'  
        if(extIndex > 0 && (filename.charAt(extIndex - 1) == '\\' || filename.charAt(extIndex - 1) == '/')){  
            return -1;  
        }  
        return extIndex;  
    }
}
