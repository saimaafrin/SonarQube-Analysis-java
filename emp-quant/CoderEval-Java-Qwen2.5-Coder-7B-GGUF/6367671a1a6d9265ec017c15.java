class Generated {
    public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
    if(byteArrayValue==null){
            throw new NullPointerException("byteArrayValue is null");
        }
        if(byteOffset<0){
            throw new IllegalArgumentException("byteOffset is negative");
        }
        if(byteLength<0){
            throw new IllegalArgumentException("byteLength is negative");
        }
        if(byteOffset+byteLength>byteArrayValue.length){
            throw new ArrayIndexOutOfBoundsException("byteOffset+byteLength is out of bounds");
        }
        if(byteLength>0){
            ensureCapacity(byteLength);
            System.arraycopy(byteArrayValue,byteOffset,this.data,this.size,byteLength);
            this.size+=byteLength;
        }
        return this;
    }
}
