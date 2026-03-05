public boolean isCompatible(DataTable dataset){
if(dataset.getBucketCount() != this.getBucketCount())
		return false;
	for(int i = 0; i < this.getBucketCount(); i++){
		if(!this.getBucket(i).isCompatible(dataset.getBucket(i)))
			return false;
	}
	return true;
}