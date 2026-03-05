class Generated {
    @Override public void write(final byte b[],final int off,final int len) throws IOException {
    if (len == 0) return; // nothing to do if (off < 0 || len < 0 || off + len > b.length) throw new IndexOutOfBoundsException(); // check bounds final ByteBuffer buffer = ByteBuffer.wrap(b, off, len); while (buffer.hasRemaining()) { final int n = channel.write(buffer); if (n <= 0) throw new ClosedChannelException(); } }
}
