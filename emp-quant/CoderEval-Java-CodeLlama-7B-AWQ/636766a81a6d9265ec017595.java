class Generated {
    final ByteVector put11(final int byteValue1,final int byteValue2){
    if(data.size()<2){
    		data.resize(2);
    	}
    	data.put(0, (byte)byteValue1);
    	data.put(1, (byte)byteValue2);
    	return this;
    }
}
