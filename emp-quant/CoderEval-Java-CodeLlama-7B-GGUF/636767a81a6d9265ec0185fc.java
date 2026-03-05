public int readTag() throws IOException {
int tag = read();
    if (tag == -1) {
        return 0;
    }
    if ((tag & 0x1f) != 0) {
        return tag;
    }
    if (tag == 0x1f) {
        tag = read();
        if (tag == -1) {
            return 0;
        }
        if ((tag & 0x80) == 0) {
            return tag << 7;
        }
        tag = read();
        if (tag == -1) {
            return 0;
        }
        if ((tag & 0x80) == 0) {
            return (tag << 14) | (tag << 7);
        }
        tag = read();
        if (tag == -1) {
            return 0;
        }
        if ((tag & 0x80) == 0) {
            return (tag << 21) | (tag << 14) | (tag << 7);
        }
        tag = read();
        if (tag == -1) {
            return 0;
        }
        if ((tag & 0x80) == 0) {
            return (tag << 28) | (tag << 21) | (tag << 14) | (tag << 7);
        }
        throw new RuntimeException("malformed: tag too large");
    }
    throw new RuntimeException("malformed: invalid tag");
}