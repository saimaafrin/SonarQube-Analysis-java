class Generated {
    public long readRawVarint64() throws IOException {
    byte tmp = readRawByte();
        if (tmp >= 0) {
            return tmp;
        }
        long result = tmp & 0x7f;
        if ((tmp = readRawByte()) >= 0) {
            return result | (tmp << 7);
        }
        result |= (tmp & 0x7f) << 7;
        if ((tmp = readRawByte()) >= 0) {
            return result | (tmp << 14);
        }
        result |= (tmp & 0x7f) << 14;
        if ((tmp = readRawByte()) >= 0) {
            return result | (tmp << 21);
        }
        result |= (tmp & 0x7f) << 21;
        if ((tmp = readRawByte()) >= 0) {
            return result | (tmp << 28);
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }
}
