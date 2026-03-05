final String readUtf(final int constantPoolEntryIndex,final char[] charBuffer){
int utfLength=u2At(constantPoolEntryIndex+1);
	int charBufferIndex=0;
	int i=constantPoolEntryIndex+3;
	while(utfLength>0){
		int charLength=Math.min(utfLength,charBuffer.length-charBufferIndex);
		System.arraycopy(classFileBuffer,i,charBuffer,charBufferIndex,charLength);
		charBufferIndex+=charLength;
		utfLength-=charLength;
		i+=charLength;
	}
	return new String(charBuffer,0,charBufferIndex);
}