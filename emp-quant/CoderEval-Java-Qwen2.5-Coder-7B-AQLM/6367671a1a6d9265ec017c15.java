class Generated {
    public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
    if(byteArrayValue==null){  
            throw new NullPointerException("byteArrayValue");  
        }  
        if(byteOffset<0||byteOffset>byteArrayValue.length){  
            throw new IndexOutOfBoundsException("byteOffset "+byteOffset);  
        }  
        if(byteLength<0||byteLength>byteArrayValue.length-byteOffset){  
            throw new IndexOutOfBoundsException("byteLength "+byteLength);  
        }  
        int newLength=length+byteLength;  
        if(newLength>capacity){  
            capacity=capacity*2>newLength?capacity*2:newLength;  
            byte[] newBytes=new byte[capacity];  
            System.arraycopy(bytes,0,newBytes,0,length);  
            bytes=newBytes;  
        }  
        System.arraycopy(byteArrayValue,byteOffset,bytes,length,byteLength);  
        length=newLength;  
        return this;  
    }
}
