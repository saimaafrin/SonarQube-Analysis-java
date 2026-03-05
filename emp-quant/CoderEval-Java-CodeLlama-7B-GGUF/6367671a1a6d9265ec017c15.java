public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
if(byteArrayValue==null){
		return this;
	}
	if(byteOffset<0||byteLength<0||byteOffset+byteLength>byteArrayValue.length){
		throw new IllegalArgumentException("byteOffset="+byteOffset+",byteLength="+byteLength+",byteArrayValue.length="+byteArrayValue.length);
	}
	if(byteLength==0){
		return this;
	}
	if(byteLength>0){
		ensureCapacity(size+byteLength);
		System.arraycopy(byteArrayValue,byteOffset,buffer,size,byteLength);
		size+=byteLength;
	}
	return this;
}