public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
if(byteArrayValue==null){
		throw new NullPointerException("byteArrayValue");
	}
	if(byteOffset<0){
		throw new IllegalArgumentException("byteOffset");
	}
	if(byteLength<0){
		throw new IllegalArgumentException("byteLength");
	}
	if(byteOffset+byteLength>byteArrayValue.length){
		throw new IllegalArgumentException("byteOffset+byteLength>byteArrayValue.length");
	}
	if(byteLength>0){
		if(byteLength>this.remaining()){
			this.ensureCapacity(this.position+byteLength);
		}
		System.arraycopy(byteArrayValue,byteOffset,this.buffer,this.position,byteLength);
		this.position+=byteLength;
	}
	return this;
}