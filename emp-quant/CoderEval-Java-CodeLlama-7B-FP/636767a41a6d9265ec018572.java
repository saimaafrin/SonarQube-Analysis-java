class Generated {
    public long readRawVarint64() throws IOException {
    long result = 0;
        int shift = 0;
        while (true) {
            final byte b = readRawByte();
            result |= (long)(b & 0x7F) << shift;
            if ((b & 0x80) == 0) {
                return result;
            }
            shift += 7;
            if (shift > 63) {
                throw InvalidProtocolBufferException.malformedVarint();
            }
        }
    }
}
