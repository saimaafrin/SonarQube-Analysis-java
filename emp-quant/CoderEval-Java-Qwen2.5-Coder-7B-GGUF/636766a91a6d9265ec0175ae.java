class Generated {
    public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
    if(byteArrayValue==null){  
            throw new NullPointerException("byteArrayValue is null");  
        }  
        if(byteOffset<0||byteLength<0||byteOffset+byteLength>byteArrayValue.length){  
            throw new IndexOutOfBoundsException("byteOffset or byteLength is out of bounds");  
        }  
        for(int i=0;i<byteLength;i++){  
            this.putByte(byteArrayValue[byteOffset+i]);  
        }  
        return this;  
    }  
    
    **Explanation**:
    - The method `putByteArray` is designed to add a portion of a byte array into a `ByteVector`.
    - It takes three parameters: `byteArrayValue` (the byte array to be added), `byteOffset` (the starting index in the byte array), and `byteLength` (the number of bytes to add).
    - The method first checks if `byteArrayValue` is null and throws a `NullPointerException` if it is.
    - It then checks if `byteOffset` and `byteLength` are within valid bounds for the byte array. If not, it throws an `IndexOutOfBoundsException`.
    - The method iterates over the specified range of the byte array and adds each byte to the `ByteVector` using the `putByte` method.
    - Finally, it returns the modified `ByteVector`.
    
    This method is useful for constructing a `ByteVector` from a portion of a larger byte array, ensuring that only the specified range is added.
}
