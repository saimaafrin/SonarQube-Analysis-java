public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
if(byteLength<0) throw new IllegalArgumentException("byteLength must be >= 0");
	if(byteOffset<0) throw new IllegalArgumentException("byteOffset must be >= 0");
	if(byteOffset+byteLength>byteArrayValue.length) throw new IllegalArgumentException("byteOffset+byteLength must be <= byteArrayValue.length");
	if(byteLength==0) return this;
	if(byteOffset==0&&byteLength==byteArrayValue.length) return putByteArray(byteArrayValue);
	if(byteLength>this.length-this.position){
		this.length=this.position+byteLength;
		this.data=Arrays.copyOf(this.data,this.length);
	}
	System.arraycopy(byteArrayValue,byteOffset,this.data,this.position,byteLength);
	this.position+=byteLength;
	return this;
}