class Generated {
    public long readRawVarint64() throws IOException {
    int b = in.read(); 
        if (b == -1) throw new EOFException(); 
        long result = b & 0x7F; 
        while ((b & 0x80) != 0) { 
            b = in.read(); 
            if (b == -1) throw new EOFException(); 
            result <<= 7; 
            result |= b & 0x7F; 
        } 
        return result; 
    } 
    
    **Write raw varint**
}
