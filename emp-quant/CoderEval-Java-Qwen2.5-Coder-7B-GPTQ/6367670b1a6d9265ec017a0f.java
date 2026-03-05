public static boolean containsAnyIgnoreCase(String str,List<String> searchStrArray){
for(String s : searchStrArray){
        if(str.toLowerCase().contains(s.toLowerCase())){
            return true;
        }
    }  
    return false;  
}