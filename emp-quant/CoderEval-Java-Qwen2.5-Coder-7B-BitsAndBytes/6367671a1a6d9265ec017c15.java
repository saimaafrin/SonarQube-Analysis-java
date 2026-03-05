public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
// Check if there is enough space in the current buffer
    if (this.byteCount + byteLength > this.buffer.length){
        // If not, resize the buffer to accommodate the new data
        this.resizeBuffer(this.byteCount + byteLength);
    }
    // Copy the specified portion of the byte array into the buffer
    System.arraycopy(byteArrayValue, byteOffset, this.buffer, this.byteCount, byteLength);
    // Update the byte count to reflect the new size of the buffer
    this.byteCount += byteLength;
    return this; // Return the modified ByteVector object
}