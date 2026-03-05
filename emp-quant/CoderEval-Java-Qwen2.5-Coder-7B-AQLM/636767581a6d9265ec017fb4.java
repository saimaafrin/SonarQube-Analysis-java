private List<Integer> computeUpperBounds(List<K> keys){
List<Integer> upperBounds = new ArrayList<>();  
    for(K key : keys){  
        int upperBound = Integer.MIN_VALUE;  
        for(Function<K, Integer> function : functions){  
            int currentUpperBound = function.apply(key);  
            if(currentUpperBound > upperBound){  
                upperBound = currentUpperBound;  
            }  
        }  
        upperBounds.add(upperBound);  
    }  
    return upperBounds;  
}  
**The type of key has several upper bounds conducted by different function,this function will return a list of the minimum upper bound of each key in the given list.**/