protected int findByte(byte value,int pos){
for(int i=pos;i<buffer.length;i++){  
        if(buffer[i]==value){  
            return i;  
        }  
    }  
    return -1;  
}  

**Searche for a byte array in the buffer, starting at the specified position.**