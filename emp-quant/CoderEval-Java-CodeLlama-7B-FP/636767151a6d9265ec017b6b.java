private static boolean startsWith(final String str,final String prefix,final boolean ignoreCase){
if(str==null||prefix==null)return false;
    if(str.length()<prefix.length())return false;
    for(int i=0;i<prefix.length();i++){
        if(str.charAt(i)!=prefix.charAt(i)){
            if(ignoreCase){
                if(Character.toLowerCase(str.charAt(i))!=Character.toLowerCase(prefix.charAt(i)))return false;
            }else{
                return false;
            }
        }
    }
    return true;
}