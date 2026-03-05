class Generated {
    public int readTag() throws IOException {
    int tag = read();
        if (tag == -1) {
            return 0;
        }
        if ((tag & TAG_TYPE_BITS) == 0) {
            throw new IOException("bad tag");
        }
        return tag;
    }
}
