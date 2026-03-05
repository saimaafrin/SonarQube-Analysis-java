public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
// Check if there is enough space in the current buffer
    if (byteOffset + byteLength > capacity) {
        // Calculate the new capacity needed
        final int newCapacity = Math.max(capacity * 2, byteOffset + byteLength);
        // Resize the buffer to the new capacity
        final byte[] newBuffer = new byte[newCapacity];
        System.arraycopy(buffer, 0, newBuffer, 0, count);
        buffer = newBuffer;
    }
    // Copy the byte array into the buffer at the specified offset
    System.arraycopy(byteArrayValue, byteOffset, buffer, count, byteLength);
    // Update the count of bytes in the buffer
    count += byteLength;
    return this;
}