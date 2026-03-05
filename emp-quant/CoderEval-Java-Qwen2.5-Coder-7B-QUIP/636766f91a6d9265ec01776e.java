@Override public void write(final byte b[],final int off,final int len) throws IOException {
// Check if the length is within the valid range
    if (len < 0) {
        throw new IOException("Invalid length: " + len);
    }
    // Write bytes to the output stream
    for (int i = 0; i < len; i++) {
        out.write(b[off + i]);
    }
}