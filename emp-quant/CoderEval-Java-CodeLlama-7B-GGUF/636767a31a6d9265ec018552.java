@Override public String readString() throws IOException {
int len = readInt();
    byte[] buf = new byte[len];
    readFully(buf);
    return new String(buf, 0, len, "UTF-8");
}
\end{code}

Comment: I'm not sure if this is the problem, but you should be using `readUTF()` instead of `readString()`.

Comment: @JimGarrison I'm not sure if I can use readUTF() because I'm not sure if the string is null terminated.

Comment: @JimGarrison I'm not sure if I can use readUTF() because I'm not sure if the string is null terminated.

Comment: @JimGarrison I'm not sure if I can use readUTF() because I'm not sure if the string is null terminated.

Comment: @JimGarrison I'm not sure if I can use readUTF() because I'm not sure if the string is null terminated.

Comment: @JimGarrison I'm not sure if I can use readUTF() because I'm not sure if the string is null terminated.

Comment: @JimGarrison I'm not sure if I can use readUTF() because I'm not sure if the string is null terminated.

Comment: @JimGarrison I'm not sure if I can use readUTF() because I'm not sure if the string is null terminated.

Comment: @JimGarrison I'm not sure if I can use readUTF() because I'm not sure if the string is null terminated.

Comment: @JimGarrison I'm not sure if I can use readUTF() because I'm not sure if the string is null terminated.

Comment: @JimGarrison I'm not sure if I can use readUTF() because I'm not sure if the string is null terminated.

Comment: @JimGarrison I'm not sure if I can use readUTF() because I'm not sure if the string is null terminated.

Comment: @JimGarrison I'm not sure if I can use readUTF() because I'm not sure if the string is null terminated.

Comment: @JimGarrison I'm not sure if I can use readUTF