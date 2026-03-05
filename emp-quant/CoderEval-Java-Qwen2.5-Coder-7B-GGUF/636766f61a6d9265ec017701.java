class Generated {
    public static int lastIndexOf(String str,String searchStr){
    if(str==null||str.isEmpty()) return INDEXNOTFOUND;  
        return str.lastIndexOf(searchStr);  
    }  
    
    **Find the first index of the searchStr in str, and return INDEXNOTFOUND if str is empty.**
}
