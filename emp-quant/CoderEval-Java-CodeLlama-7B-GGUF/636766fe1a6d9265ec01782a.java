class Generated {
    final String readUtf(final int constantPoolEntryIndex,final char[] charBuffer){
    int i=constantPoolEntryIndex;
    	int length=((ClassFile.Utf8)constantPool[i]).length;
    	int j=0;
    	while(j<length){
    		charBuffer[j]=((ClassFile.Utf8)constantPool[i]).bytes[j];
    		j++;
    	}
    	return new String(charBuffer,0,length);
    }
}
