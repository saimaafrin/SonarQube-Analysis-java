class Generated {
    protected int findByte(byte value,int pos){
    int i=pos;
    	while(i<buffer.length){
    		if(buffer[i]==value) return i;
    		i++;
    	}
    	return -1;
    }
}
