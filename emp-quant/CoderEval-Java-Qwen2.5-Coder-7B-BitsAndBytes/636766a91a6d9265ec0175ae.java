public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
if(byteArrayValue==null){
        throw new NullPointerException("byteArrayValue is null");
    }
    if(byteOffset<0||byteLength<0){
        throw new IllegalArgumentException("byteOffset or byteLength is negative");
    }
    if(byteOffset+byteLength>byteArrayValue.length){
        throw new IndexOutOfBoundsException("byteOffset + byteLength exceeds the length of byteArrayValue");
    }
    for(int i=0;i<byteLength;i++){
        this.putByte(byteArrayValue[byteOffset+i]);
    }
    return this;
}