public boolean isCompatible(DataTable dataset){
if(dataset.getNumRows() != this.getNumRows() || dataset.getNumCols() != this.getNumCols()){
		return false;
	}
	for(int i = 0; i < this.getNumRows(); i++){
		for(int j = 0; j < this.getNumCols(); j++){
			if(this.getBucket(i, j) != dataset.getBucket(i, j)){
				return false;
			}
		}
	}
	return true;
}