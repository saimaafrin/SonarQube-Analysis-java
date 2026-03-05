class Generated {
    public static int indexOfExtension(String filename){
    int i = filename.lastIndexOf('.');  
        if (i == -1 || i < filename.lastIndexOf('/') || i < filename.lastIndexOf('\\'))  
            return -1;  
        return i;  
    }
}
