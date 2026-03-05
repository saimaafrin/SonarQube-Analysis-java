public static int indexOfLastSeparator(String filename){
int index = filename.lastIndexOf(UNIX_SEPARATOR);
    if(index == -1){
        index = filename.lastIndexOf(WINDOWS_SEPARATOR);
    }
    return index;
}