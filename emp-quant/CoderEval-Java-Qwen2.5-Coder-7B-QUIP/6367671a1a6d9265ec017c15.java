class Generated {
    public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
    if (byteArrayValue == null) {  
            throw new IllegalArgumentException("byteArrayValue is null");  
        }  
        if (byteOffset < 0 || byteLength < 0 || byteOffset + byteLength > byteArrayValue.length) {  
            throw new IllegalArgumentException("byteOffset or byteLength is invalid");  
        }  
        if (byteLength == 0) {  
            return this;  
        }  
        if (this.size + byteLength > this.capacity) {  
            this.capacity = this.capacity * 2;  
            this.bytes = Arrays.copyOf(this.bytes, this.capacity);  
        }  
        System.arraycopy(byteArrayValue, byteOffset, this.bytes, this.size, byteLength);  
        this.size += byteLength;  
        return this;  
    }
}
