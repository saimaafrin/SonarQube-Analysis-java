class Generated {
    private void enlarge(final int size){
    final int[] data = this.data;
        final int[] newData = new int[size];
        int i;
        for(i = 0; i < data.length; i++)
            newData[i] = data[i];
        this.data = newData;
    }
}
