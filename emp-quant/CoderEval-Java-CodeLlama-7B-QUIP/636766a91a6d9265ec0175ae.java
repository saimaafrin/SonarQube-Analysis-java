class Generated {
    public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
    if(byteArrayValue==null){
    		return this;
    	}
    	if(byteOffset<0){
    		throw new IllegalArgumentException("byteOffset<0");
    	}
    	if(byteLength<0){
    		throw new IllegalArgumentException("byteLength<0");
    	}
    	if(byteOffset+byteLength>byteArrayValue.length){
    		throw new IllegalArgumentException("byteOffset+byteLength>byteArrayValue.length");
    	}
    	if(byteLength==0){
    		return this;
    	}
    	if(byteLength==1){
    		return this.putByte(byteArrayValue[byteOffset]);
    	}
    	if(byteLength==2){
    		return this.putByte(byteArrayValue[byteOffset])
    				.putByte(byteArrayValue[byteOffset+1]);
    	}
    	if(byteLength==3){
    		return this.putByte(byteArrayValue[byteOffset])
    				.putByte(byteArrayValue[byteOffset+1])
    				.putByte(byteArrayValue[byteOffset+2]);
    	}
    	if(byteLength==4){
    		return this.putByte(byteArrayValue[byteOffset])
    				.putByte(byteArrayValue[byteOffset+1])
    				.putByte(byteArrayValue[byteOffset+2])
    				.putByte(byteArrayValue[byteOffset+3]);
    	}
    	if(byteLength==5){
    		return this.putByte(byteArrayValue[byteOffset])
    				.putByte(byteArrayValue[byteOffset+1])
    				.putByte(byteArrayValue[byteOffset+2])
    				.putByte(byteArrayValue[byteOffset+3])
    				.putByte(byteArrayValue[byteOffset+4]);
    	}
    	if(byteLength==6){
    		return this.putByte(byteArrayValue[byteOffset])
    				.putByte(byteArrayValue[byteOffset+1])
    				.putByte(byteArrayValue[byteOffset+2
    }}
}
