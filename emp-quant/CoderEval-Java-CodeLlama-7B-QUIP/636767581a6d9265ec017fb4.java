class Generated {
    private List<Integer> computeUpperBounds(List<K> keys){
    List<Integer> upperBounds = new ArrayList<Integer>();
        for(K key : keys){
            int upperBound = computeUpperBound(key);
            upperBounds.add(upperBound);
        }
        return upperBounds;
    }
}
