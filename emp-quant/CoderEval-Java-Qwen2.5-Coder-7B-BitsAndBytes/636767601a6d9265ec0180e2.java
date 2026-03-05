class Generated {
    private List<Pair<List<Pair<Integer,Integer>>,E>> computeGlobalSeparatorList(){
    List<Pair<List<Pair<Integer,Integer>>,E>> globalSeparatorList = new ArrayList<>();
        for(E e : this.edgeSet()){
            if(!isCircle(e)){
                List<Pair<Integer,Integer>> localSeparatorList = new ArrayList<>();
                Set<Integer> neighbors = getNeighbors(e);
                for(Integer v : neighbors){
                    Set<Integer> separator = findMinimalSeparator(v,e);
                    localSeparatorList.add(new Pair<>(separator,v));
                }
                globalSeparatorList.add(new Pair<>(localSeparatorList,e));
            }
        }
        return globalSeparatorList;
    }
}
