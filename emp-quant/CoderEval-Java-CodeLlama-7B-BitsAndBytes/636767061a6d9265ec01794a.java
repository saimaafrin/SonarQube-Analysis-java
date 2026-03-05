class Generated {
    public static int indexOfExtension(String filename){
    int extensionPos=filename.lastIndexOf(EXTENSION_SEPARATOR);
        int lastSeparator=indexOfLastSeparator(filename);
        if(extensionPos>lastSeparator){
            return extensionPos;
        }else{
            return -1;
        }
    }
}
