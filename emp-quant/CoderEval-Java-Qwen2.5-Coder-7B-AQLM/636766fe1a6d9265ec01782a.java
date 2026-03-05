class Generated {
    final String readUtf(final int constantPoolEntryIndex,final char[] charBuffer){
    final int offset = constantPoolEntryIndex * 3;  
        final int utfLength = (charBuffer[offset] << 8) | charBuffer[offset + 1];  
        final int utfOffset = offset + 2;  
        return new String(charBuffer,utfOffset,utfLength);  
    }
}
