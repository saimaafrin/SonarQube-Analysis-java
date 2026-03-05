class Generated {
    public byte[] toByteArray(){
    byte[] bytes = new byte[size()];
        for (int i = 0; i < size(); i++) {
            bytes[i] = get(i);
        }
        return bytes;
    }
}
