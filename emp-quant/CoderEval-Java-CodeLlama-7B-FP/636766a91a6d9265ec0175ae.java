class Generated {
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
    		throw new IllegalArgumentException("byteOffset+byteLength");
    	}
    	for(int i=0;i<byteLength;i++){
    		putByte(byteArrayValue[byteOffset+i]);
    	}
    	return this;
    }
}
