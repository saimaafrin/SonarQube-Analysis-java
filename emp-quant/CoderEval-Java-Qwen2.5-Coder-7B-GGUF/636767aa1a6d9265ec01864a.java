class Generated {
    public byte[] toByteArray(){
    byte[] bytes = new byte[4]; 
        bytes[0] = (byte) (this.value >> 24); 
        bytes[1] = (byte) (this.value >> 16); 
        bytes[2] = (byte) (this.value >> 8); 
        bytes[3] = (byte) this.value; 
        return bytes; 
    }
}
