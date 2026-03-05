class Generated {
    public boolean isCompatible(DataTable dataset){
    if(dataset.getNumRows()!=this.getNumRows()){
    		return false;
    	}
    	for(int i=0;i<dataset.getNumRows();i++){
    		if(dataset.get(i).getBucket()!=this.get(i).getBucket()){
    			return false;
    		}
    	}
    	return true;
    }
}
