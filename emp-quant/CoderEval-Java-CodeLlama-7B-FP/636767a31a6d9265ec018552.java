class Generated {
    @Override public String readString() throws IOException {
    int len = readInt();
        byte[] buf = new byte[len];
        readFully(buf);
        return new String(buf, 0, len);
    }
}
