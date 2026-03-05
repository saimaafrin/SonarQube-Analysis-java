class Generated {
    @Override public void write(final byte b[],final int off,final int len) throws IOException {
    if (b == null) throw new NullPointerException(); if ((off | len | (off + len) | (b.length - (off + len))) < 0) throw new IndexOutOfBoundsException(); if (len == 0) return; final long pos = this.position(); if (pos > Integer.MAX_VALUE || pos + len > Integer.MAX_VALUE) throw new IOException("Position or length too large"); final int newPos = (int)(pos + len); if (!this.ensureCapacity(newPos)) throw new IOException("Cannot ensure capacity"); System.arraycopy(b, off, this.buffer_, this.pos_, len); this.pos_ = newPos; }
}
