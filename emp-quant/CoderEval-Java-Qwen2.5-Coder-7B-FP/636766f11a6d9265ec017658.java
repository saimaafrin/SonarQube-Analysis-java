class Generated {
    public static int indexOfLastSeparator(String filename){
    if(filename == null) return -1;  
        int len = filename.length();  
        if(len == 0) return -1;  
        int lastUnixPos = filename.lastIndexOf('/');  
        int lastWindowsPos = filename.lastIndexOf('\\');  
        return Math.max(lastUnixPos, lastWindowsPos);  
    }  
    
    **Return the name of the file without the path.**
}
