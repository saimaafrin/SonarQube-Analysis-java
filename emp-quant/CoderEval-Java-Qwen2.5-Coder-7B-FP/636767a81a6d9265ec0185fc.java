class Generated {
    public int readTag() throws IOException {
    // Read one byte from the input stream
        int b = in.read();  
        if (b == -1) {  
            return 0;  
        }  
        // Extract the tag type bits from the first byte
        int tagTypeBits = b & TAG_TYPE_MASK;  
        // Check if the tag type bits are valid
        if ((tagTypeBits >>> TAG_TYPE_BITS) != 0) {  
            throw new InvalidProtocolBufferException("Invalid tag: " + b);  
        }  
        // Return the tag value
        return tagTypeBits;  
    }
}
