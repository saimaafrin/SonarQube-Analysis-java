private static boolean startsWith(final String str,final String prefix,final boolean ignoreCase){
if(str==null||prefix==null||prefix.length()<=0||str.length()<prefix.length()){
        return false;
    }
    if(ignoreCase){
        return str.toLowerCase().startsWith(prefix.toLowerCase());
    }
    return str.startsWith(prefix);
}