class Generated {
    public static String applyRelativePath(String path,String relativePath){
    if(path==null||relativePath==null){  
            return null;  
        }  
        int lastIndexOfFOLDER_SEPARATOR=path.lastIndexOf(FOLDER_SEPARATOR);  
        if(lastIndexOfFOLDER_SEPARATOR==-1){  
            return null;  
        }  
        String basePath=path.substring(0,lastIndexOfFOLDER_SEPARATOR);  
        return basePath+relativePath;  
    }
}
