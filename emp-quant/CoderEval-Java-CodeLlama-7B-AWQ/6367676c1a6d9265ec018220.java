public static String stripFilenameExtension(String path){
int lastDot = path.lastIndexOf('.');
	if(lastDot == -1) return path;
	return path.substring(0, lastDot);
}