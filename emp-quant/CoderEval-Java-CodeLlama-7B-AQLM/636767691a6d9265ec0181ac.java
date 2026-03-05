public static String applyRelativePath(String path,String relativePath){
if(path==null){
		throw new NullPointerException("path");
	}
	if(relativePath==null){
		throw new NullPointerException("relativePath");
	}
	if(relativePath.length()==0){
		return path;
	}
	if(path.endsWith(FOLDER_SEPARATOR)){
		return path+relativePath;
	}
	return path+FOLDER_SEPARATOR+relativePath;
}