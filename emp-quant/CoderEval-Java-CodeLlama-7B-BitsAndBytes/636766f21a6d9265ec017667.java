class Generated {
    public short readShort(final int offset){
    return (short)((classFileBuffer[offset] & 0xFF) << 8 | (classFileBuffer[offset + 1] & 0xFF));
    }
}
