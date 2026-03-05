public int nonZeros(int row){
int count = 0;
    for (int i=0; i<mat[row].length; i++){
        if (mat[row][i] != 0){
            count++;
        }
    }
    return count;
}