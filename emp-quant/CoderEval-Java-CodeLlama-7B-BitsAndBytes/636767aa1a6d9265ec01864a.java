class Generated {
    public byte[] toByteArray(){
    byte[] data = new byte[size()];
        ByteBuffer buffer = ByteBuffer.wrap(data);
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        buffer.put(this.data);
        return data;
    }
}
