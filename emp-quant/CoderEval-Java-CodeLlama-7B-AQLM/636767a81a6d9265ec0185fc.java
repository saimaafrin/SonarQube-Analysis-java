class Generated {
    public int readTag() throws IOException {
    int tag = 0;
        int shift = 0;
        while (true) {
            int b = read();
            if (b == -1) {
                throw new EOFException();
            }
            tag |= (b & 0x7F) << shift;
            if ((b & 0x80) == 0) {
                return tag >>> TAG_TYPE_BITS;
            }
            shift += 7;
            if (shift >= 35) {
                throw new RuntimeException("Corrupted input. Too many tag bits");
            }
        }
    }
}
