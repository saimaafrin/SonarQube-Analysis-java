class Generated {
    public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
    if(byteLength<0) throw new IllegalArgumentException("byteLength must be non-negative");
    	if(byteOffset<0) throw new IllegalArgumentException("byteOffset must be non-negative");
    	if(byteOffset+byteLength>byteArrayValue.length) throw new IllegalArgumentException("byteOffset+byteLength must be less than or equal to byteArrayValue.length");
    	if(byteLength==0) return this;
    	if(byteLength+byteOffset>this.length) this.enlargeByteVector(byteLength+byteOffset);
    	System.arraycopy(byteArrayValue,byteOffset,this.byteArray,this.length,byteLength);
    	this.length+=byteLength;
    	return this;
    }
}
