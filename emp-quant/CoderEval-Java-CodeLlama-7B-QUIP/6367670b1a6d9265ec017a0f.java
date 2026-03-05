public static boolean containsAnyIgnoreCase(String str,List<String> searchStrArray){
if(str == null || searchStrArray == null || searchStrArray.size() == 0 || str.length() == 0){
        return false;
    }
    for(String searchStr : searchStrArray){
        if(str.contains(searchStr)){
            return true;
        }
    }
    return false;
}