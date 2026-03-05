class Generated {
    public int nonZeros(int row){
    int count = 0;
        for(int i = 0; i < this.arr[row].length; i++){
            if(this.arr[row][i] != 0){
                count++;
            }
        }
        return count;
    }
}
