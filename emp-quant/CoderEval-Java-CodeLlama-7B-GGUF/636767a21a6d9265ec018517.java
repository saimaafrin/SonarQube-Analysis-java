class Generated {
    public final byte[] toByteArray(){
    if(this.buffer.length == 0){
            return new byte[0];
        }
        byte[] bytes = new byte[this.buffer.length];
        System.arraycopy(this.buffer, 0, bytes, 0, this.buffer.length);
        return bytes;
    }
}
