public static int lastIndexOf(String str,String searchStr){
if(str.isEmpty()){
        return INDEXNOTFOUND;
    }
    return str.lastIndexOf(searchStr);
}