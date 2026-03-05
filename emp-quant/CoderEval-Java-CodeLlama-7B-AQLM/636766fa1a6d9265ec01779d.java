public static boolean isAsciiControl(final char ch){
return (ch < 0x20) || (ch == 0x7F);
}