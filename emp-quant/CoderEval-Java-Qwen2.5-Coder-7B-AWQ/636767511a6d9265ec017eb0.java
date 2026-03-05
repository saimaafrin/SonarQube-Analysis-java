class Generated {
    public int nonZeros(int row){
    int count = 0;
        for (int i=0; i < this.cols(); i++){
            if(this.get(row, i) != 0){
                count++;
            }
        }
        return count;
    }
}
