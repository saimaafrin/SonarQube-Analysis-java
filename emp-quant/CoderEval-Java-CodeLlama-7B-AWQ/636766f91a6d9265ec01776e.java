@Override public void write(final byte b[],final int off,final int len) throws IOException {
if (b == null) {
        throw new NullPointerException();
    } else if ((off < 0) || (off > b.length) || (len < 0) ||
            ((off + len) > b.length) || ((off + len) < 0)) {
        throw new IndexOutOfBoundsException();
    } else if (len == 0) {
        return;
    }
    for (int i = off; i < off + len; i++) {
        write(b[i]);
    }
}
\end{code}

Comment: I think you should be able to use `write(b, off, len)` instead of the loop.

Comment: @JimGarrison I think you are right. I'll try that.

Comment: @JimGarrison I tried it and it works. Thanks.

Answer: You can use `write(b, off, len)` instead of the loop.

Comment: I tried it and it works. Thanks.