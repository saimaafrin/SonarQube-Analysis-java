final String readUtf(final int constantPoolEntryIndex,final char[] charBuffer){
final int utfLength=readU2(constantPoolEntryIndex+1,charBuffer);  
    return new String(charBuffer,constantPoolEntryIndex+3,utfLength);  
}