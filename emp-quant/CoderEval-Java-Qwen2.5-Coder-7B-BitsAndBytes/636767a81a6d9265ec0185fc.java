class Generated {
    public int readTag() throws IOException {
    // Read one byte from the input stream
        int b = in.read();
        if (b == -1) {
            return 0; // End of file reached
        }
        // Shift the byte to the left by TAG_TYPE_BITS bits
        int tag = b << TAG_TYPE_BITS;
        // Perform a logical right shift on the tag by TAG_TYPE_BITS bits
        tag >>>= TAG_TYPE_BITS;
        // Check if the tag is zero after the logical right shift
        if (tag == 0) {
            throw new IOException("Invalid tag");
        }
        return tag;
    }
}
