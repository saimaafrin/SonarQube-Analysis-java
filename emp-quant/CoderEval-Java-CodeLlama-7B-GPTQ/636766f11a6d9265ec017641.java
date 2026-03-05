@Override public int available() throws IOException {
if (index >= buf.length) {
        return 0;
    } else {
        return buf.length - index;
    }
}
\end{code}

Comment: I think you are right. I'm not sure why I didn't see that. Thanks!