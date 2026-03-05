class Generated {
    @Override public void write(final byte b[],final int off,final int len) throws IOException {
    if (b == null) throw new NullPointerException(); if ((off | len | (b.length - (off + len))) < 0) throw new IndexOutOfBoundsException(); if (len == 0) return; final long pos = this.position; if (pos > Integer.MAX_VALUE || pos + len > Integer.MAX_VALUE) throw new OutOfMemoryError("Too large position or length"); final int newPos = (int)(pos + len); try { this.position = newPos; } catch (IOException e) { // Revert the position back to its original value. this.position = (int)pos; throw e; } System.arraycopy(b, off, this.buf, this.pos, len); }
}
