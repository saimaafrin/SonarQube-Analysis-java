public long readLong(final int offset){
long value = 0;  
  for (int i = 0; i < 8; i++) {  
    value = (value << 8) | (this.data[offset + i] & 0xFF);  
  }  
  return value;  
}  

**Read a signed long value.**