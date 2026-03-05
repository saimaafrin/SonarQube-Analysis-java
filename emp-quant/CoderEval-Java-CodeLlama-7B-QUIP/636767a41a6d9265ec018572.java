class Generated {
    public long readRawVarint64() throws IOException {
    long result = 0;
        long input = 0;
        int i = 0;
        for (i = 0; ; i++) {
            input = readRawByte();
            result |= (input & 0x80) << (i * 7);
            if (input != 0x80)
                break;
            if (i >= 6)
                throw new ProtocolException("Invalid varint detected");
        }
        return result;
    }
}
