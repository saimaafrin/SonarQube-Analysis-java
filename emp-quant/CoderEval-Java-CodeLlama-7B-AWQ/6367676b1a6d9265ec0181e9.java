public static boolean substringMatch(CharSequence str,int index,CharSequence substring){
if(str==null||substring==null)
        return false;
    int len=str.length();
    int subLen=substring.length();
    if(index<0||index+subLen>len)
        return false;
    for(int i=0;i<subLen;i++)
        if(str.charAt(index+i)!=substring.charAt(i))
            return false;
    return true;
}