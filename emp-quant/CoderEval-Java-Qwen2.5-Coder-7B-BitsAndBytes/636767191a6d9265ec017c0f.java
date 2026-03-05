class Generated {
    private void enlarge(final int size){
    if (size <= 0) return; // nothing to do
        final byte[] newData = new byte[data.length + size]; // create a new array with the increased size
        System.arraycopy(data, 0, newData, 0, data.length); // copy the old data into the new array
        data = newData; // update the reference to the new array
    }
}
