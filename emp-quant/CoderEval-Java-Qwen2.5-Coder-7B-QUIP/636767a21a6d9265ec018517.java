class Generated {
    public final byte[] toByteArray(){
    byte[] bytes = new byte[bufferSize];
        for(int i = 0; i < bufferSize; i++){
            bytes[i] = buffer[i];
        }
        return bytes;
    }
}
