public boolean equals(final byte[] data,int offset,final int len){
if(len!=length)return false;
	for(int i=0;i<len;i++){
		if(bytes[i]!=data[offset+i])return false;
	}
	return true;
}