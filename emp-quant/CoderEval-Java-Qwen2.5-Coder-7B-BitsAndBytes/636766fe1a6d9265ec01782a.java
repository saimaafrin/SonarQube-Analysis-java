class Generated {
    final String readUtf(final int constantPoolEntryIndex,final char[] charBuffer){
    final int offset = constantPoolEntryIndex * 3; // Each UTF-8 entry is 3 bytes long.
        final int length = classFileBuffer[offset] & 0xFF; // The first byte is the length of the string.
        System.arraycopy(classFileBuffer,offset + 1,charBuffer,0,length); // Copy the string into the buffer.
        return new String(charBuffer,0,length); // Return the string.
    }
}
