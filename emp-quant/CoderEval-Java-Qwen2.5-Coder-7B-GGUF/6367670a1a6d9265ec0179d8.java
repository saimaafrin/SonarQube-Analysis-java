class Generated {
    @Override public void write(final byte[] b) throws IOException {
    write(b, 0, b.length); } /**Write the byte array b to the buffer based on the encoding.**/
    @Override public void write(final byte[] b, final int off, final int len) throws IOException { if (b == null) throw new NullPointerException(); if ((off | len | (off + len) | (b.length - (off + len))) < 0) throw new IndexOutOfBoundsException(); if (len == 0) return; if (len == 1) { write(b[off]); return; } final int size = len * 3; if (size > out.length) out = new char[size]; int c = 0; for (int i = off; i < off + len; i++) { c = b[i]; if (c < 0) c += 256; out[c] = (char) c; } outWriter.write(out, 0, len); } /**Write the byte array b to the buffer based on the encoding.**/
    @Override public void write(final int b) throws IOException { outWriter.write((char) b); } /**Write the byte array b to the buffer based on the encoding.**/
    @Override public void write(final String s) throws IOException { outWriter.write(s); } /**Write the byte array b to the buffer based on the encoding.**/
    @Override public void write(final String s, final int off, final int len) throws IOException { outWriter.write(s, off, len); } /**Write the byte array b to the buffer based on the encoding.**/
    @Override public void write(final char[] cbuf) throws IOException { outWriter.write(cbuf); } /**Write the byte array b to the buffer based on the encoding.**/
    @Override public void write(final char[] cbuf, final int off, final int len) throws IOException { outWriter.write(cbuf, off, len); } /**Write the byte array b to the buffer based on the encoding.**/
    @Override public void write(final int[] iarr) throws IOException { outWriter.write(iarr); } /**Write the byte array b to the buffer based on the encoding.**/
    @Override public void write(final int[] iarr, final int off, final int len) throws IOException { outWriter.write(iarr, off, len); } /**Write the byte array b to the buffer based on the encoding.**/
    @Override public void write(final long[] larr) throws IOException { outWriter.write(larr); } /**Write the byte array b to the
}
