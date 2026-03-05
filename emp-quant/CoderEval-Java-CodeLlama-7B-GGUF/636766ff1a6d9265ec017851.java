protected int findByte(byte value,int pos){
int i=pos;
	while(i<buf.length){
		if(buf[i]==value)return i;
		i++;
	}
	return -1;
}