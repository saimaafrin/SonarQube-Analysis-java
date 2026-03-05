private static boolean startsWith(final String str,final String prefix,final boolean ignoreCase){
if(str==null||prefix==null)return false;
    int len=prefix.length();
    if(str.length()<len)return false;
    for(int i=0;i<len;i++){
        if(ignoreCase){
            if(Character.toLowerCase(str.charAt(i))!=Character.toLowerCase(prefix.charAt(i)))return false;
        }else{
            if(str.charAt(i)!=prefix.charAt(i))return false;
        }
    }
    return true;
}