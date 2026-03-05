public boolean isCompatible(DataTable dataset){
if (buckets == null) {  
        return true;  
    }  
    if (buckets.length != dataset.getBuckets().length) {  
        return false;  
    }  
    for (int i = 0; i < buckets.length; i++) {  
        if (!buckets[i].equals(dataset.getBuckets()[i])) {  
            return false;  
        }  
    }  
    return true;  
}  
```