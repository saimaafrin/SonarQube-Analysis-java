public byte[] toByteArray(){
byte[] bytes = new byte[size()];
    int i = 0;
    for(ByteBuffer b : buffers) {
        b.position(0);
        b.get(bytes, i, b.remaining());
        i += b.remaining();
    }
    return bytes;
}