class Generated {
    @Override public String readString() throws IOException {
    int length = readInt();
        if (length < 0)
            throw new RuntimeException("negative length found");
        byte[] buf = new byte[length];
        int read = 0;
        int n;
        while (read < length && (n = readFromUnderlyingStream(buf, length - read)) != EOF)
            read += n;
        if (read != length)
            throw new RuntimeException("not enough data");
        return new String(buf, 0, length);
    }
}
