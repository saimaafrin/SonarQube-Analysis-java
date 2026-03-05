class Generated {
    final ByteVector put11(final int byteValue1,final int byteValue2){
    if (byteValue1 < 0 || byteValue1 > 255 || byteValue2 < 0 || byteValue2 > 255) {  
            throw new IllegalArgumentException("Invalid byte value");  
        }  
        ensureCapacity(data, 2);  
        data[data.length - 2] = (byte) byteValue1;  
        data[data.length - 1] = (byte) byteValue2;  
        return this;  
    }
}
