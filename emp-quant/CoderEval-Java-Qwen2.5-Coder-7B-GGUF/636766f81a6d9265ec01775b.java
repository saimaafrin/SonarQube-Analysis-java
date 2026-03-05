class Generated {
    public long readLong(final int offset){
    return ((long)readInt(offset) << 32) | (readInt(offset + 4) & 0xFFFFFFFFL);
    }
}
