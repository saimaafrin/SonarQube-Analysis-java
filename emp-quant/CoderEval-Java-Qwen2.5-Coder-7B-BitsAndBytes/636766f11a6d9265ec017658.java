public static int indexOfLastSeparator(String filename){
if (filename == null) {
        return -1;
    }
    int len = filename.length();
    if (len == 0) {
        return -1;
    }
    int posUnix = filename.lastIndexOf('/');
    int posWindows = filename.lastIndexOf('\\');
    return Math.max(posUnix, posWindows);
}