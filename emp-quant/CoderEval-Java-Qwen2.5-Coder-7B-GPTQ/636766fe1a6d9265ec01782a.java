final String readUtf(final int constantPoolEntryIndex,final char[] charBuffer){
final int utfLength=readU2(constantPoolEntryIndex,charBuffer); //length of UTF-8 string
    final int utfOffset=constantPoolEntryIndex+2; //offset to start of UTF-8 string
    return new String(charBuffer,utfOffset,utfLength);
}