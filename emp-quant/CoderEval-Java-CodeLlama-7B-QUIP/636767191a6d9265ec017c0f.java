class Generated {
    private void enlarge(final int size){
    byte[] newData = new byte[data.length + size];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }
}
