private static boolean startsWith(final String str,final String prefix,final boolean ignoreCase){
if(str==null||prefix==null)return false;
    if(prefix.length()>str.length())return false;
    int i=0;
    while(i<prefix.length()){
        if(ignoreCase){
            if(Character.toLowerCase(str.charAt(i))!=Character.toLowerCase(prefix.charAt(i)))return false;
        }else{
            if(str.charAt(i)!=prefix.charAt(i))return false;
        }
        i++;
    }
    return true;
}