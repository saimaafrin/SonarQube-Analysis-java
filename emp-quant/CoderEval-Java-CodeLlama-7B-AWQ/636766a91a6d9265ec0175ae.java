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
		throw new IllegalArgumentException("byteOffset+byteLength is greater than byteArrayValue.length");
	}
	for(int i=0;i<byteLength;i++){
		putByte(byteArrayValue[byteOffset+i]);
	}
	return this;
}