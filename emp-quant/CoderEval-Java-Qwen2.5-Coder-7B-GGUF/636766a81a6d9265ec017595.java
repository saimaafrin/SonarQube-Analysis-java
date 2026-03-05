final ByteVector put11(final int byteValue1,final int byteValue2){
if(data.length<=pos+1){  
        enlarge();  
    }  
    data[pos++]=byteValue1;  
    data[pos++]=byteValue2;  
    return this;  
}