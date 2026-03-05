class Generated {
    final String readUtf(final int constantPoolEntryIndex,final char[] charBuffer){
    final int offset = constantPoolEntryIndex * 4;  
        final int length = ((int)classFileBuffer[offset + 1] & 0xFF);  
        final int utfOffset = ((int)classFileBuffer[offset + 2] & 0xFF) << 8 | ((int)classFileBuffer[offset + 3] & 0xFF);  
        return new String(charBuffer,utfOffset,length);  
    }
}
