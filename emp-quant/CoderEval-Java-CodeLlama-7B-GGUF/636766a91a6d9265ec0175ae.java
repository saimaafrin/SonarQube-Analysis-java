class Generated {
    public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
    if(byteArrayValue==null){
    		return this;
    	}
    	if(byteOffset<0){
    		throw new IllegalArgumentException("byteOffset must be greater than or equal to 0.");
    	}
    	if(byteLength<0){
    		throw new IllegalArgumentException("byteLength must be greater than or equal to 0.");
    	}
    	if(byteOffset+byteLength>byteArrayValue.length){
    		throw new IllegalArgumentException("byteOffset+byteLength must be less than or equal to the length of the byte array.");
    	}
    	if(byteLength==0){
    		return this;
    	}
    	if(byteOffset==0&&byteLength==byteArrayValue.length){
    		return putByteArray(byteArrayValue);
    	}
    	if(byteLength==0){
    		return this;
    	}
    	if(byteOffset==0){
    		return putByteArray(byteArrayValue,byteLength);
    	}
    	if(byteLength==byteArrayValue.length){
    		return putByteArray(byteArrayValue,byteOffset);
    	}
    	if(byteLength==0){
    		return this;
    	}
    	if(byteOffset==0&&byteLength==byteArrayValue.length){
    		return putByteArray(byteArrayValue);
    	}
    	if(byteLength==0){
    		return this;
    	}
    	if(byteOffset==0&&byteLength==byteArrayValue.length){
    		return putByteArray(byteArrayValue);
    	}
    	if(byteLength==0){
    		return this;
    	}
    	if(byteOffset==0&&byteLength==byteArrayValue.length){
    		return putByteArray(byteArrayValue);
    	}
    	if(byteLength==0){
    		return this;
    	}
    	if(byteOffset==0&&byteLength==byteArrayValue.length){
    		return putByteArray(byteArrayValue);
    	}
    	if(byteLength==0){
    		return this;
    	}
    	if(byteOffset==0&&byteLength==byteArrayValue.length){
    		return putByteArray(byteArray
    }}
}
