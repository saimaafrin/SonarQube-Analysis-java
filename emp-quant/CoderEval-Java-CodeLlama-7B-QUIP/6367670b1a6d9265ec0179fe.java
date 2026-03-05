class Generated {
    @Override public void write(byte b[]) throws IOException {
    synchronized (lock) {
            lock.write(b);
        }
    }
}
