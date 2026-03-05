@Override public int available() throws IOException {
return markpos == -1 ? 0 : (int) Math.min(marklimit, markpos - pos); }