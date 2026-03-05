class Generated {
    public static int indexOfExtension(String filename){
    int i = filename.lastIndexOf('.');
        int p = filename.lastIndexOf(File.separatorChar);
        return p>=0 && i<p ? -1 : i;
    }
}
