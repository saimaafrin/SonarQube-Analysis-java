public boolean isCompatible(DataTable dataset){
if(dataset.getNumBuckets() != this.getNumBuckets())
		return false;
	for(int i = 0; i < dataset.getNumBuckets(); i++){
		if(!dataset.getBucket(i).equals(this.getBucket(i)))
			return false;
	}
	return true;
}