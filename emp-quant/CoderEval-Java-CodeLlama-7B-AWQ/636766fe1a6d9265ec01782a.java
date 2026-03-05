class Generated {
    final String readUtf(final int constantPoolEntryIndex,final char[] charBuffer){
    final int length=readUnsignedShort(constantPoolEntryIndex);
    	if(length>charBuffer.length)
    		charBuffer=new char[length];
    	for(int i=0;i<length;i++)
    		charBuffer[i]=readChar(constantPoolEntryIndex+2+i*2);
    	return new String(charBuffer,0,length);
    }
}
