public static int countOccurrencesOf(String str,String sub){
int count = 0;
    for(int i = 0; i < str.length(); i++){
        if(str.substring(i).startsWith(sub)){
            count++;
            i += sub.length() - 1;
        }
    }
    return count;
}