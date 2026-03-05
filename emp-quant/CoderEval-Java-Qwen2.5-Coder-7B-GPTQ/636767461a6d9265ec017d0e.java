private Pair<List<Integer>,Long> computeSuffixSum(List<Integer> bounds){
List<Integer> suffixSum = new ArrayList<>();
    long totalSum = 0;
    for(int i=bounds.size()-1;i>=0;i--){
        totalSum += bounds.get(i);
        suffixSum.add((int)totalSum);
    }
    Collections.reverse(suffixSum);
    return new Pair<>(suffixSum,totalSum);
}