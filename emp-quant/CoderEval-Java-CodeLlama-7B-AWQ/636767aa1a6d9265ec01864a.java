public byte[] toByteArray(){
int size = size();
    byte[] byteArray = new byte[size];
    ByteBuffer buffer = ByteBuffer.wrap(byteArray);
    buffer.put(this);
    return byteArray;
}