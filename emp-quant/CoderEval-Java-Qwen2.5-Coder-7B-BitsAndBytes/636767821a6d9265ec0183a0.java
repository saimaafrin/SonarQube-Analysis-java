protected static void deleteFile(String fileName){
File file = new File(fileName); 
    if(file.exists()){ 
        file.delete(); 
    } 
}