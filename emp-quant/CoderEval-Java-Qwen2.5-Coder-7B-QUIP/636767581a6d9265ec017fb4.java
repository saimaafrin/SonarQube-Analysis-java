private List<Integer> computeUpperBounds(List<K> keys){
List<Integer> upperBounds = new ArrayList<>();
    for (K key : keys) {
        List<Integer> bounds = getUpperBounds(key);
        int minBound = Collections.min(bounds);
        upperBounds.add(minBound);
    }
    return upperBounds;
}