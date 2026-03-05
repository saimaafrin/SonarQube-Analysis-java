public int nonZeros(int row){
int count = 0;
    for(int i = 0; i < matrix[row].length; i++){
        if(matrix[row][i] != 0){
            count++;
        }
    }
    return count;
}