class Generated {
    private List<Integer> computeLowerBounds(List<K> keys){
    List<Integer> lowerBounds = new ArrayList<Integer>();
        for(int i = 0; i < keys.size(); i++){
            lowerBounds.add(computeLowerBound(keys.get(i)));
        }
        return lowerBounds;
    }
}
