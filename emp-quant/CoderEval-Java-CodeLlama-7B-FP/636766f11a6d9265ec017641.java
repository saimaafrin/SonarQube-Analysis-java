@Override public int available() throws IOException {
return (int) (end - pos);
}