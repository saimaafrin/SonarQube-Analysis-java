class Generated {
    @Override public String readString() throws IOException {
    return readString(0); }
    @Override public String readString(int offset) throws IOException {
        int length = readInt(offset);
        if (length == -1) return null;
        byte[] bytes = new byte[length];
        readFully(bytes, offset + 4);
        return new String(bytes, StandardCharsets.UTF_8);
    }
    ```
    In this code snippet, the `readString` method reads a string from a buffer. It first reads an integer to determine the length of the string. If the length is `-1`, it returns `null`. Otherwise, it reads the specified number of bytes into a byte array and then converts the byte array to a string using UTF-8 encoding. The `readFully` method is used to ensure that the entire string is read from the buffer.
}
