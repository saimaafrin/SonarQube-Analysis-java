class Generated {
    @Override public void write(final byte b[],final int off,final int len) throws IOException {
    if (b == null) throw new NullPointerException(); if ((off | len | (b.length - (off + len))) < 0) throw new IndexOutOfBoundsException(); for (int i = off; i < off + len; ++i) this.write(b[i]); }
}
