public static int indexOfLastSeparator(String filename){
if(filename==null){
        return -1;
    }
    return filename.lastIndexOf(File.separator);
}