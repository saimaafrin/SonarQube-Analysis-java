private List<Integer> computeUpperBounds(List<K> keys){
List<Integer> upperBounds = new ArrayList<>();  
    for(K key : keys){  
        int minBound = Integer.MAX_VALUE;  
        if(key instanceof A){  
            minBound = Math.min(minBound, ((A)key).getMinBound());  
        }  
        if(key instanceof B){  
            minBound = Math.min(minBound, ((B)key).getMinBound());  
        }  
        if(key instanceof C){  
            minBound = Math.min(minBound, ((C)key).getMinBound());  
        }  
        upperBounds.add(minBound);  
    }  
    return upperBounds;  
}  

**This is an example of how to use this function:**

```java