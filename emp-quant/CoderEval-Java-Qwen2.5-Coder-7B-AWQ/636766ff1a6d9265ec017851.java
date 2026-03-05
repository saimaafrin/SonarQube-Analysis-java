class Generated {
    protected int findByte(byte value,int pos){
    while(pos < buf.length && buf[pos] != value) pos++;  
        return pos;  
    }
}
