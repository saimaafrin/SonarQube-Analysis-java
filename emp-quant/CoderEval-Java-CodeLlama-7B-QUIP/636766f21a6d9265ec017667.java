class Generated {
    public short readShort(final int offset){
    return (short) ((((int) classFileBuffer[offset]) << 8) + (int) classFileBuffer[offset + 1]);
    }
}
