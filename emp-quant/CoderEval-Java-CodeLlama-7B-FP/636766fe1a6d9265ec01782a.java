final String readUtf(final int constantPoolEntryIndex,final char[] charBuffer){
int length=readUnsignedShort(constantPoolEntryIndex);
	if(length>charBuffer.length)
		charBuffer=new char[length];
	for(int i=0;i<length;i++)
		charBuffer[i]=readChar();
	return new String(charBuffer,0,length);
}