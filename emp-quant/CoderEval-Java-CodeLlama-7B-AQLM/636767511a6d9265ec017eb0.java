class Generated {
    public int nonZeros(int row){
    int count = 0;
    	for(int i = 0; i < n; i++){
    		if(A[row][i] != 0)
    			count++;
    	}
    	return count;
    }
}
