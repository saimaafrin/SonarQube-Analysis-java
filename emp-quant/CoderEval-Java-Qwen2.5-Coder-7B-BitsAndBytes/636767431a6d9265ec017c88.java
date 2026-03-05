private List<Integer> computeLowerBounds(List<K> keys){
// Initialize a list to store the minimum lower bounds
    List<Integer> minLowerBounds = new ArrayList<>();
    
    // Iterate over each key in the input list
    for (K key : keys) {
        int currentMin = Integer.MAX_VALUE;
        
        // Check if there is a specific lower bound function for this key type
        if (key instanceof A) {
            currentMin = Math.min(currentMin, ((A) key).getALowerBound());
        } else if (key instanceof B) {
            currentMin = Math.min(currentMin, ((B) key).getBLowerBound());
        } else if (key instanceof C) {
            currentMin = Math.min(currentMin, ((C) key).getCLowerBound());
        }
        
        // Add the minimum lower bound to the result list
        minLowerBounds.add(currentMin);
    }
    
    return minLowerBounds;
}