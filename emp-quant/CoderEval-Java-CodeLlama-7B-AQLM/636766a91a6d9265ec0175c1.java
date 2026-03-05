class Generated {
    private void enlarge(final int size){
    final int[] newData = new int[size];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }
}
