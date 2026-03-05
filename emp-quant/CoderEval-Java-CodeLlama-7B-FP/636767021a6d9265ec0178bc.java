public static int indexOf(String str,String searchStr){
int index = -1;
    for(int i = 0; i < str.length(); i++){
        if(str.charAt(i) == searchStr.charAt(0)){
            if(str.substring(i).startsWith(searchStr)){
                index = i;
                break;
            }
        }
    }
    return index;
}