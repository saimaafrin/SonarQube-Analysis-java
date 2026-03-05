private List<Integer> computeLowerBounds(List<K> keys){
List<Integer> lowerBounds = new ArrayList<>();  
    for(K key : keys){  
        int lowerBound = Integer.MAX_VALUE;  
        if(key instanceof A){  
            lowerBound = Math.min(lowerBound, ((A)key).getLowerBoundA());  
        }  
        if(key instanceof B){  
            lowerBound = Math.min(lowerBound, ((B)key).getLowerBoundB());  
        }  
        if(key instanceof C){  
            lowerBound = Math.min(lowerBound, ((C)key).getLowerBoundC());  
        }  
        lowerBounds.add(lowerBound);  
    }  
    return lowerBounds;  
}  
**The type of key has several lower bounds conducted by different function,this function will return a list of the maximum lower bound of each key in the given list.**/