public boolean isCompatible(DataTable dataset){
if (this.buckets == null) {
        return true;
    }
    for (int i = 0; i < this.buckets.length; i++) {
        if (!this.buckets[i].equals(dataset.getBuckets()[i])) {
            return false;
        }
    }
    return true;
}