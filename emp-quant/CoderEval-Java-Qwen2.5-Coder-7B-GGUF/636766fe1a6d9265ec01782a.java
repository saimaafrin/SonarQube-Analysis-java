class Generated {
    final String readUtf(final int constantPoolEntryIndex,final char[] charBuffer){
    final int utfLength=readU2(constantPoolEntryIndex+1,charBuffer);  
        final int utfOffset=readU2(constantPoolEntryIndex+3,charBuffer);  
        return new String(charBuffer,utfOffset,utfLength);  
    }
}
