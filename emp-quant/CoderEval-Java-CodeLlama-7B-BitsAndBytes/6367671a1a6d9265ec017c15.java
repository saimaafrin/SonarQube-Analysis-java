public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
if(byteArrayValue==null)return this;
	if(byteOffset<0||byteLength<0||byteOffset+byteLength>byteArrayValue.length)throw new IndexOutOfBoundsException();
	if(byteLength==0)return this;
	if(byteLength+this.length>this.byteArray.length){
		byte[] newByteArray=new byte[Math.max(this.byteArray.length*2,this.length+byteLength)];
		System.arraycopy(this.byteArray,0,newByteArray,0,this.length);
		this.byteArray=newByteArray;
	}
	System.arraycopy(byteArrayValue,byteOffset,this.byteArray,this.length,byteLength);
	this.length+=byteLength;
	return this;
}