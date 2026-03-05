class Generated {
    @Override public void write(final byte[] b) throws IOException {
    if (b == null) throw new NullPointerException("Null input"); 
        final int len = b.length; 
        if (len == 0) return; 
        switch (encoding) { 
            case UTF_8: 
                out.write(b, 0, len); 
                break; 
            default: 
                throw new UnsupportedOperationException("Encoding not supported: " + encoding); 
        } 
    } 
    
    **Explanation**:
    - The method `write` takes a byte array `b` as input and writes it to the buffer.
    - It first checks if the input byte array is null and throws a `NullPointerException` if it is.
    - It then determines the length of the byte array and returns immediately if the length is zero.
    - Depending on the specified encoding (`UTF_8` in this case), it writes the byte array to the output stream using the appropriate method.
    - If any other encoding is specified, it throws an `UnsupportedOperationException`.
}
