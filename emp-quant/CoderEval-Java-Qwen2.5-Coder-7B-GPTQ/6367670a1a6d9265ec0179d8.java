@Override public void write(final byte[] b) throws IOException {
if (b == null) {
        throw new NullPointerException("byte array is null");
    }
    // Convert the byte array to a string using the specified encoding
    String str = new String(b, encoding);
    // Write the string to the buffer
    out.write(str);
}