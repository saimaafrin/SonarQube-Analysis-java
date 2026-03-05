public static String trimLeadingCharacter(String str,char leadingCharacter){
int index=0;
    while(index<str.length() && str.charAt(index)==leadingCharacter){
        index++;
    }
    return str.substring(index);
}