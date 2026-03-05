final ByteVector put11(final int byteValue1,final int byteValue2){
if(data.length<2){
		data=Arrays.copyOf(data,2);
	}
	data[0]=byteValue1;
	data[1]=byteValue2;
	return this;
}