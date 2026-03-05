final ByteVector put11(final int byteValue1,final int byteValue2){
if(data.length<index+2){
		data=Arrays.copyOf(data,data.length*2);
	}
	data[index++]= (byte) byteValue1;
	data[index++]= (byte) byteValue2;
	return this;
}