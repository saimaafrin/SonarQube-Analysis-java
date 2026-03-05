public boolean equals(final byte[] data,int offset,final int len){
if (offset < 0 || offset + len > data.length) {  
        throw new ArrayIndexOutOfBoundsException();  
    }  
    for (int i = 0; i < len; i++) {  
        if (data[i + offset] != bytes[i]) {  
            return false;  
        }  
    }  
    return true;  
}