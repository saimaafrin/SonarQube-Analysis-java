class Generated {
    public long readRawVarint64() throws IOException {
    // Read the first byte
        int b = in.read();
        if (b == -1) {
            throw new EOFException("Unexpected end of stream");
        }
        // Check if the most significant bit is set
        if ((b & 0x80) == 0) {
            return b;
        } else {
            // Continue reading until the most significant bit is not set
            long result = b & 0x7F;
            for (int shift = 7; ; shift += 7) {
                b = in.read();
                if (b == -1) {
                    throw new EOFException("Unexpected end of stream");
                }
                result |= (long)(b & 0x7F) << shift;
                if ((b & 0x80) == 0) {
                    break;
                }
            }
            return result;
        }
    }
}
