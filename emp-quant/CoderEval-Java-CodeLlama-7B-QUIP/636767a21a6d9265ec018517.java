class Generated {
    public final byte[] toByteArray(){
    byte[] bytes = new byte[size()];
        copyTo(bytes);
        return bytes;
    }
}
