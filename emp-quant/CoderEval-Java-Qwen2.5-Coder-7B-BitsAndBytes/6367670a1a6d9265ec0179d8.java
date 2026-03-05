class Generated {
    @Override public void write(final byte[] b) throws IOException {
    if (b == null) throw new NullPointerException(); 
        final int len = b.length; 
        if (len == 0) return; 
        switch (encoding) { 
            case UTF_8: 
                out.write(UTF8.encode(b, 0, len)); 
                break; 
            case ISO_8859_1: 
                out.write(b); 
                break; 
            default: 
                throw new IllegalArgumentException("Unsupported encoding: " + encoding); 
        } 
    } 
    
    **Created Question**:
    What is the purpose of the `write` method in the given code snippet and how does it handle different encodings?
    
    **Created Answer**:
    The purpose of the `write` method in the given code snippet is to write a byte array `b` to an output stream (`out`) based on the specified encoding. The method handles two encodings: UTF-8 and ISO-8859-1. For UTF-8 encoding, it uses a custom encoder (`UTF8.encode`) to convert the byte array into a sequence of characters that can be written to the output stream. For ISO-8859-1 encoding, it directly writes the byte array to the output stream without any conversion. If an unsupported encoding is provided, the method throws an `IllegalArgumentException`. This ensures that the data is encoded correctly before being written to the output stream, maintaining compatibility with various character sets.
}
