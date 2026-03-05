final ByteVector put11(final int byteValue1,final int byteValue2){
//check whether there is enough space in the array
    if (this.data.length - this.pos < 2) {
        //if not, resize the array to twice its current size
        this.resizeArray(this.data.length * 2);
    }
    //put the two bytes into the array at the current position
    this.data[this.pos++] = (byte) byteValue1;
    this.data[this.pos++] = (byte) byteValue2;
    //return the ByteVector object
    return this;
}