class Generated {
    public long readRawVarint64() throws IOException {
    int shift = 0; 
        long result = 0; 
        while (true) { 
            byte b = input.readByte(); 
            if ((b & 0x80) == 0) { 
                return result | (long)(b << shift); 
            } 
            result |= (long)((b & 0x7F) << shift); 
            shift += 7; 
        } 
    } 
    
    **Write raw varint**
}
