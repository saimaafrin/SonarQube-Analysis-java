public int readTag() throws IOException {
int tag = 0;
    for (int i = 0; i < TAG_TYPE_BITS; i++) {
        tag = tag << 1 | readByte();
    }
    return tag;
}