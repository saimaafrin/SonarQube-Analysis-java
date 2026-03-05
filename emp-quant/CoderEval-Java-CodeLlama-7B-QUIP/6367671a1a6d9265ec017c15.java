class Generated {
    public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
    if(byteLength<0){
    		throw new IllegalArgumentException("byteLength must be greater than or equal to 0.");
    	}
    	if(byteOffset<0){
    		throw new IllegalArgumentException("byteOffset must be greater than or equal to 0.");
    	}
    	if(byteOffset+byteLength>byteArrayValue.length){
    		throw new IllegalArgumentException("byteOffset+byteLength must be less than or equal to the length of the byte array.");
    	}
    	if(byteArrayValue.length<byteOffset+byteLength){
    		throw new IllegalArgumentException("byteArrayValue.length must be greater than or equal to byteOffset+byteLength.");
    	}
    	if(byteArrayValue.length<byteOffset){
    		throw new IllegalArgumentException("byteArrayValue.length must be greater than or equal to byteOffset.");
    	}
    	if(byteArrayValue.length<byteOffset+byteLength){
    		throw new IllegalArgumentException("byteArrayValue.length must be greater than or equal to byteOffset+byteLength.");
    	}
    	if(byteArrayValue.length<byteOffset){
    		throw new IllegalArgumentException("byteArrayValue.length must be greater than or equal to byteOffset.");
    	}
    	if(byteArrayValue.length<byteOffset+byteLength){
    		throw new IllegalArgumentException("byteArrayValue.length must be greater than or equal to byteOffset+byteLength.");
    	}
    	if(byteArrayValue.length<byteOffset){
    		throw new IllegalArgumentException("byteArrayValue.length must be greater than or equal to byteOffset.");
    	}
    	if(byteArrayValue.length<byteOffset+byteLength){
    		throw new IllegalArgumentException("byteArrayValue.length must be greater than or equal to byteOffset+byteLength.");
    	}
    	if(byteArrayValue.length<byteOffset){
    		throw new IllegalArgumentException("byteArrayValue.length must be greater than or equal to byteOffset.");
    	}
    	if(byteArrayValue.length<byteOffset+byteLength){
    		throw new IllegalArgumentException("byteArrayValue.length must be greater than or equal to byteOffset+byteLength.");
    }}
}
