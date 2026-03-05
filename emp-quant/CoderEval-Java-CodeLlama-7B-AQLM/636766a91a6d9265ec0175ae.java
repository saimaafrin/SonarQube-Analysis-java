public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
if(byteArrayValue==null){
		throw new NullPointerException();
	}
	if(byteOffset<0||byteLength<0||byteOffset+byteLength>byteArrayValue.length){
		throw new IndexOutOfBoundsException();
	}
	if(byteLength==0){
		return this;
	}
	ensureCapacity(byteLength);
	System.arraycopy(byteArrayValue,byteOffset,this.byteArrayValue,this.byteArrayValue.length,byteLength);
	this.byteArrayValue=Arrays.copyOf(this.byteArrayValue,this.byteArrayValue.length+byteLength);
	return this;
}