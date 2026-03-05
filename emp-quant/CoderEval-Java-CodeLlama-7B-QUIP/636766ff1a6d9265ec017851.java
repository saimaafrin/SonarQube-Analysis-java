protected int findByte(byte value,int pos){
int i=pos;
	while(i<buffer.length()&&buffer.getByte(i)!=value)i++;
	return i;
}