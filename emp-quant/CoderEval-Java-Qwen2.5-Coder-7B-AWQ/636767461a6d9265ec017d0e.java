class Generated {
    private Pair<List<Integer>,Long> computeSuffixSum(List<Integer> bounds){
    List<Integer> suffixSum = new ArrayList<>(bounds.size());
        long totalSum = 0;
        for(int i=0; i<bounds.size(); i++){
            int currentElement = bounds.get(i);
            if(i==0){
                suffixSum.add(currentElement);
            }else{
                suffixSum.add(suffixSum.get(i-1) + currentElement);
            }
            totalSum += currentElement;
        }
        return new Pair<>(suffixSum, totalSum);
    }
}
