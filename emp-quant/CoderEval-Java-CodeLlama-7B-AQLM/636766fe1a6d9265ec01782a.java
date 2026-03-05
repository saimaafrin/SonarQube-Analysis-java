final String readUtf(final int constantPoolEntryIndex,final char[] charBuffer){
int i=constantPoolEntryIndex;
	int length=(((int)classFileBuffer[i++])<<8) | ((int)classFileBuffer[i++]);
	int j=0;
	while(j<length){
		charBuffer[j++]=classFileBuffer[i++];
	}
	return new String(charBuffer,0,length);
}