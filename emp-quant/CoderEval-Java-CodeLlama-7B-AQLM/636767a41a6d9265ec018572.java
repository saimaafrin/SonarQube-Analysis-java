public long readRawVarint64() throws IOException {
long result = 0;
    for (int shift = 0; shift < 64; shift += 7) {
        byte b = readRawByte();
        result |= (long) (b & 0x7F) << shift;
        if ((b & 0x80) == 0) {
            return result;
        }
    }
    throw InvalidProtocolBufferException.invalidVarint();
}