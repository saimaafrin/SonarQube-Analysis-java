class Generated {
    public long readRawVarint64() throws IOException {
    long result = 0; 
        for (int shift = 0; shift < 64; shift += 7) { 
            int b = input.readByte(); 
            if (b == -1) { 
                throw new EOFException(); 
            } 
            result |= ((long) (b & 0x7F)) << shift; 
            if ((b & 0x80) == 0) { 
                return result; 
            } 
        } 
        throw new IOException("Malformed varint"); 
    }
}
