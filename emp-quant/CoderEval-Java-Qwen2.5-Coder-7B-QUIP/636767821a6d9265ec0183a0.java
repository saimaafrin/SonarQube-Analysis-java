protected static void deleteFile(String fileName){
File file = new File(fileName);  
    if (file.exists()) {  
        file.delete();  
    }  
}  

**Delete the given directory and all its contents recursively**