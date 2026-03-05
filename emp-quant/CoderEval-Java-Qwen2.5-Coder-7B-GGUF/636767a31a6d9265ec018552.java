class Generated {
    @Override public String readString() throws IOException {
    int length = readInt(); 
        if (length == -1) return null; 
        byte[] bytes = new byte[length]; 
        readFully(bytes); 
        return new String(bytes, StandardCharsets.UTF_8); 
    }
}
