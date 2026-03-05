class Generated {
    public int readTag() throws IOException {
    int tag = read();
        if (tag == -1) {
            return 0;
        }
        if ((tag & TAG_TYPE_MASK) == 0) {
            throw new IOException("Corrupted, tag type invalid at " + mPos);
        }
        return tag;
    }
}
