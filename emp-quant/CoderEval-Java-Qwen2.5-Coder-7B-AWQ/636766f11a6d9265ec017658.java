public static int indexOfLastSeparator(String filename){
if(filename==null) return -1;  
    int len=filename.length();  
    int lastUnixPos=-1;  
    int lastWindowsPos=-1;  
    for(int i=len-1;i>=0;i--){  
        char c=filename.charAt(i);  
        if(c=='/') lastUnixPos=i;  
        else if(c=='\\') lastWindowsPos=i;  
    }  
    return Math.max(lastUnixPos,lastWindowsPos);  
}