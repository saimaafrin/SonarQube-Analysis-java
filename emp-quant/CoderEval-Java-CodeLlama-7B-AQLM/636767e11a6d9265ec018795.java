public boolean isCompatible(DataTable dataset){
if(dataset.getBucketNum() != this.getBucketNum()){
			return false;
		}
		for(int i = 0; i < this.getBucketNum(); i++){
			if(!this.getBucket(i).equals(dataset.getBucket(i))){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Check whether the existed buckets are the same as the buckets.
	 * @param dataset
	 * @return
	 */
	public boolean isCompatible(DataTable dataset, int[] bucketIndex){
		if(dataset.getBucketNum() != this.getBucketNum()){
			return false;
		}
		for(int i = 0; i < this.getBucketNum(); i++){
			if(!this.getBucket(i).equals(dataset.getBucket(bucketIndex[i]))){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Check whether the existed buckets are the same as the buckets.
	 * @param dataset
	 * @return
	 */
	public boolean isCompatible(DataTable dataset, int[] bucketIndex, int[] bucketNum){
		if(dataset.getBucketNum() != this.getBucketNum()){
			return false;
		}
		for(int i = 0; i < this.getBucketNum(); i++){
			if(!this.getBucket(i).equals(dataset.getBucket(bucketIndex[i]))){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Check whether the existed buckets are the same as the buckets.
	 * @param dataset
	 * @return
	 */
	public boolean isCompatible(DataTable dataset, int[] bucketIndex, int[] bucketNum, int[] bucketSize){
}