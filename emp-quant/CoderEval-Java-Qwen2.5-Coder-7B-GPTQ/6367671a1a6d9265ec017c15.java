class Generated {
    public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
    // Check if there is enough space in the current buffer
        if (byteArrayValue.length - byteOffset < byteLength) {
            throw new IllegalArgumentException("Invalid offset or length");
        }
        
        // Ensure there is enough capacity to hold the new data
        ensureCapacity(byteLength);
        
        // Copy the data from the input array to the internal buffer
        System.arraycopy(byteArrayValue, byteOffset, this.buffer, this.offset + this.size, byteLength);
        
        // Update the size of the byte vector
        this.size += byteLength;
        
        return this; // Return the modified ByteVector instance for chaining
    }
}
