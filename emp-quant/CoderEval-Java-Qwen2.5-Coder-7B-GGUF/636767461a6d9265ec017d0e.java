class Generated {
    private Pair<List<Integer>,Long> computeSuffixSum(List<Integer> bounds){
    List<Integer> suffixSum = new ArrayList<>(bounds.size());
        long sum = 0;
        for(int i = bounds.size() - 1; i >= 0; i--){
            sum += bounds.get(i);
            suffixSum.add(0, (int)sum);
        }
        return new Pair<>(suffixSum, sum);
    }
}
