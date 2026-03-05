class Generated {
    public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
    if(byteArrayValue==null){
    		return this;
    	}
    	if(byteOffset<0){
    		throw new IllegalArgumentException("byteOffset is negative.");
    	}
    	if(byteLength<0){
    		throw new IllegalArgumentException("byteLength is negative.");
    	}
    	if(byteOffset+byteLength>byteArrayValue.length){
    		throw new IllegalArgumentException("byteOffset+byteLength is greater than the length of the byte array.");
    	}
    	if(byteLength==0){
    		return this;
    	}
    	if(byteOffset==0 && byteLength==byteArrayValue.length){
    		return putByteArray(byteArrayValue);
    	}
    	if(byteLength==0){
    		return this;
    	}
    	if(byteOffset+byteLength>byteArrayValue.length){
    		throw new IllegalArgumentException("byteOffset+byteLength is greater than the length of the byte array.");
    	}
    	if(byteLength==0){
    		return this;
    	}
    	if(byteOffset==0 && byteLength==byteArrayValue.length){
    		return putByteArray(byteArrayValue);
    	}
    	if(byteLength==0){
    		return this;
    	}
    	if(byteOffset+byteLength>byteArrayValue.length){
    		throw new IllegalArgumentException("byteOffset+byteLength is greater than the length of the byte array.");
    	}
    	if(byteLength==0){
    		return this;
    	}
    	if(byteOffset==0 && byteLength==byteArrayValue.length){
    		return putByteArray(byteArrayValue);
    	}
    	if(byteLength==0){
    		return this;
    	}
    	if(byteOffset+byteLength>byteArrayValue.length){
    		throw new IllegalArgumentException("byteOffset+byteLength is greater than the length of the byte array.");
    	}
    	if(byteLength==0){
    		return this;
    	}
    	if(byteOffset==0 && byteLength==byteArrayValue.length){
    		return putByteArray(byteArrayValue);
    	}
    	if(byte
    }
}
