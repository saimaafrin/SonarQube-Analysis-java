public int readTag() throws IOException {
int tag = readUnsignedByte();
    if (tag == 0) {
        tag = readUnsignedByte();
        if (tag == 0) {
            throw new EOFException();
        }
    }
    return tag;
}