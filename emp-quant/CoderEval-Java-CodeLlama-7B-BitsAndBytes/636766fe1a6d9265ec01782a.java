final String readUtf(final int constantPoolEntryIndex,final char[] charBuffer){
int i=constantPoolEntryIndex;
	int length=(((int)classFileBuffer[i++]&0xFF)<<8)|(classFileBuffer[i++]&0xFF);
	int j=0;
	while(j<length){
		charBuffer[j++]=classFileBuffer[i++];
	}
	return new String(charBuffer,0,j);
}