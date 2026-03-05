class Generated {
    public static String applyRelativePath(String path,String relativePath){
    if(path==null||path.isEmpty()){  
            return null;  
        }  
        if(relativePath==null||relativePath.isEmpty()){  
            return path;  
        }  
        int lastIndexOfFOLDER_SEPARATOR=path.lastIndexOf(FOLDER_SEPARATOR);  
        if(lastIndexOfFOLDER_SEPARATOR==-1){  
            return path+relativePath;  
        }  
        return path.substring(0,lastIndexOfFOLDER_SEPARATOR+1)+relativePath;  
    }  
    **/Combine the substring before FOLDER_SEPARATOR of the given path with the given relative path to construct a new full file path,and return the full file path.**/
}
