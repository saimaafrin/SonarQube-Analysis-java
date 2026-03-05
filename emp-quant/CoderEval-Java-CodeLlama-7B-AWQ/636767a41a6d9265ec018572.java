class Generated {
    public long readRawVarint64() throws IOException {
    long result = 0;
        for (int shift = 0; shift < 64; shift += 7) {
            final byte b = readRawByte();
            result |= (long)(b & 0x7F) << shift;
            if ((b & 0x80) == 0) {
                return result;
            }
        }
        throw new IOException("CodedInputStream encountered a length-delimited field or a malformed varint.");
    }
}
