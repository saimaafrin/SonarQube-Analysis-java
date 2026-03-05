class Generated {
    public static boolean containsAnyIgnoreCase(String str,List<String> searchStrArray){
    for(String searchStr:searchStrArray){  
            if(str.toLowerCase().contains(searchStr.toLowerCase())){  
                return true;  
            }  
        }  
        return false;  
    }  
    
    **Check whether str contains elements in searchStrArray. If yes, true is returned. If no, false is returned.**
}
