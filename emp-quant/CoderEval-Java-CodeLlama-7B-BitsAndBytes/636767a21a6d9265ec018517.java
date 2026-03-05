public final byte[] toByteArray(){
byte[] bytes = new byte[size];
    System.arraycopy(buf, 0, bytes, 0, size);
    return bytes;
}
\end{code}

\strong{LinkedBuffer.java}

\begin{code}