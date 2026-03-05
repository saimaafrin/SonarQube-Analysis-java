class Generated {
    private List<Integer> computeLowerBounds(List<K> keys){
    List<Integer> lowerBounds = new ArrayList<>();
        for (K key : keys) {
            lowerBounds.add(computeLowerBound(key));
        }
        return lowerBounds;
    }
}
