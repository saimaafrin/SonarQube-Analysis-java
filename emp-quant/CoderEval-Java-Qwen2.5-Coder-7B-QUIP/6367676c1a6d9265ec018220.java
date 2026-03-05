class Generated {
    public static String stripFilenameExtension(String path){
    if (path == null) {
            return null;
        }
        int extIndex = path.lastIndexOf('.');
        if (extIndex == -1) {
            return path;
        }
        return path.substring(0, extIndex);
    }
}
