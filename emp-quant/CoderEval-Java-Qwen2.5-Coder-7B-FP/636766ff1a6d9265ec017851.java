class Generated {
    protected int findByte(byte value,int pos){
    while(pos < this.length && this[pos] != value) pos++;  
        return pos;  
    }
}
