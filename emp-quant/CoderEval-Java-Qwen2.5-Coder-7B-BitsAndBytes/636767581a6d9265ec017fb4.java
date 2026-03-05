private List<Integer> computeUpperBounds(List<K> keys){
// Initialize a list to store the upper bounds
    List<Integer> upperBounds = new ArrayList<>();
    
    // Iterate over each key in the input list
    for (K key : keys) {
        int minUpperBound = Integer.MAX_VALUE;
        
        // Check if there is an upper bound function for this key type
        if (key instanceof A) {
            minUpperBound = Math.min(minUpperBound, ((A) key).getUpperBound());
        } else if (key instanceof B) {
            minUpperBound = Math.min(minUpperBound, ((B) key).getUpperBound());
        } else if (key instanceof C) {
            minUpperBound = Math.min(minUpperBound, ((C) key).getUpperBound());
        }
        
        // Add the minimum upper bound to the result list
        upperBounds.add(minUpperBound);
    }
    
    return upperBounds;
}