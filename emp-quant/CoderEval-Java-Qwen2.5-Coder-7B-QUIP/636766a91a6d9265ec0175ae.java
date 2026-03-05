class Generated {
    public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
    if (byteArrayValue == null) {  
            throw new IllegalArgumentException("byteArrayValue is null");  
        }  
        if (byteOffset < 0) {  
            throw new IllegalArgumentException("byteOffset is negative");  
        }  
        if (byteLength < 0) {  
            throw new IllegalArgumentException("byteLength is negative");  
        }  
        if (byteOffset + byteLength > byteArrayValue.length) {  
            throw new IllegalArgumentException("byteOffset + byteLength is greater than the length of the byte array");  
        }  
        for (int i = 0; i < byteLength; i++) {  
            this.vector[i + this.vector.length] = byteArrayValue[byteOffset + i];  
        }  
        this.vector = Arrays.copyOf(this.vector, this.vector.length + byteLength);  
        return this;  
    }
}
