public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
if(byteArrayValue==null){
        throw new NullPointerException("byteArrayValue is null");
    }
    if(byteOffset<0||byteLength<0){
        throw new IllegalArgumentException("byteOffset or byteLength is negative");
    }
    if(byteOffset+byteLength>byteArrayValue.length){
        throw new ArrayIndexOutOfBoundsException("byteOffset and byteLength are out of bounds");
    }
    for(int i=0;i<byteLength;i++){
        this.vector.add((byte)byteArrayValue[byteOffset+i]);
    }
    return this;
}