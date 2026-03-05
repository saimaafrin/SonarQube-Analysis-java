class Generated {
    @Override public String readString() throws IOException {
    int length = readInt(); // Read the length of the string
        if (length == -1) {
            return null; // Return null if the length is -1, indicating end of stream
        }
        byte[] bytes = new byte[length]; // Create a byte array to hold the string data
        readFully(bytes); // Read the specified number of bytes into the array
        return new String(bytes, StandardCharsets.UTF_8); // Convert the byte array to a UTF-8 encoded string
    }
}
