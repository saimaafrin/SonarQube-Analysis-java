public static boolean substringMatch(CharSequence str,int index,CharSequence substring){
int length = substring.length();
    if(index < 0 || index > str.length() - length){
        return false;
    }
    for(int i=0;i<length;i++){
        if(str.charAt(index + i) != substring.charAt(i)){
            return false;
        }
    }
    return true;
}