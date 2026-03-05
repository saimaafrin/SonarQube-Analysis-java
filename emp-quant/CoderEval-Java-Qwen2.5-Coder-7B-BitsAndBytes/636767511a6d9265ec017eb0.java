class Generated {
    public int nonZeros(int row){
    int count = 0;
        for (int i=0; i<cols; i++){
            if (data[row][i] != 0){
                count++;
            }
        }
        return count;
    }
}
