class Generated {
    private Pair<List<Integer>,Long> computeSuffixSum(List<Integer> bounds){
    List<Integer> suffixSum = new ArrayList<>();
        long sum = 0;
        for(int i = 0; i < bounds.size(); i++){
            sum += bounds.get(i);
            suffixSum.add((int)sum);
        }
        return new Pair<>(suffixSum,sum);
    }
}
