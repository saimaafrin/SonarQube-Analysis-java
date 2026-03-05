final ByteVector put11(final int byteValue1,final int byteValue2){
//check if there is enough space in the vector
    if(data.length < index + 2){
        //if not, double the size of the vector
        final int newLength = data.length * 2;
        final byte[] newData = new byte[newLength];
        System.arraycopy(data,0,newData,0,data.length);
        data = newData;
    }
    //put the two bytes into the vector at the current index
    data[index++] = (byte)byteValue1;
    data[index++] = (byte)byteValue2;
    //return the updated ByteVector object
    return this;
}