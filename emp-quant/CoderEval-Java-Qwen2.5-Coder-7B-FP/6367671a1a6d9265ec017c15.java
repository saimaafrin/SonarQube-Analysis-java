class Generated {
    public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
    // Check if there is enough space in the current buffer
        if (this.buf.length - this.wpos < byteLength) {
            // If not, resize the buffer to accommodate the new data
            this.ensureCapacity(this.wpos + byteLength);
        }
        // Copy the specified portion of the byte array into the buffer at the current write position
        System.arraycopy(byteArrayValue, byteOffset, this.buf, this.wpos, byteLength);
        // Update the write position to reflect the added data
        this.wpos += byteLength;
        return this; // Return the modified ByteVector object for method chaining
    }
}
