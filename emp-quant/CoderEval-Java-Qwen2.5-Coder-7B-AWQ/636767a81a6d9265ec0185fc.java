public int readTag() throws IOException {
// Read one byte from the input stream
    int b = in.read();  
    if (b == -1) {  
        return 0;  
    }  
    // Shift the byte to the left by TAG_TYPE_BITS bits and then perform a logical right shift by TAG_TYPE_BITS bits
    int tag = ((b << TAG_TYPE_BITS) >>> TAG_TYPE_BITS);  
    if (tag == 0) {  
        throw new IOException("Invalid tag");  
    }  
    return tag;  
}