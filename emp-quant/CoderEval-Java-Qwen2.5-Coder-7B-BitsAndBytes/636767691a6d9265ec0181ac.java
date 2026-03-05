class Generated {
    public static String applyRelativePath(String path,String relativePath){
    int folderSeparatorIndex=path.lastIndexOf(FOLDER_SEPARATOR);  
        if(folderSeparatorIndex==-1){  
            return path+relativePath;  
        }else{  
            return path.substring(0,folderSeparatorIndex)+FOLDER_SEPARATOR+relativePath;  
        }  
    }
}
