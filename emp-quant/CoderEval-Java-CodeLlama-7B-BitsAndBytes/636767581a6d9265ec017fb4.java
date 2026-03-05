class Generated {
    private List<Integer> computeUpperBounds(List<K> keys){
    List<Integer> upperBounds = new ArrayList<Integer>();
        for(K key : keys){
            upperBounds.add(computeUpperBound(key));
        }
        return upperBounds;
    }
}
