class Generated {
    public long readRawVarint64() throws IOException {
    long result = 0;
        int shift = 0;
        while (true) {
            long byte0 = readRawByte();
            result |= (byte0 & 0x7F) << shift;
            if ((byte0 & 0x80) == 0) {
                break;
            }
            shift += 7;
        }
        return result;
    }
}
