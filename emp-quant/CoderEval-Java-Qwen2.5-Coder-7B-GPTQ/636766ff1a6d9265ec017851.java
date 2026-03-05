class Generated {
    protected int findByte(byte value,int pos){
    while(pos < data.length && data[pos] != value) pos++;  
        return pos;  
    }
}
