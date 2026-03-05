protected int findByte(byte value,int pos){
for(int i=pos;i<buf.length;i++){
		if(buf[i]==value)return i;
	}
	return -1;
}