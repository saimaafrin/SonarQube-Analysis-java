public static boolean containsAnyIgnoreCase(String str,List<String> searchStrArray){
for(String searchStr:searchStrArray){  
        if(str.toLowerCase().contains(searchStr.toLowerCase())){  
            return true;  
        }  
    }  
    return false;  
}