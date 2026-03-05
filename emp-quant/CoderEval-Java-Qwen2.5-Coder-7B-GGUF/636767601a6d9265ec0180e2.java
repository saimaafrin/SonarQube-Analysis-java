class Generated {
    private List<Pair<List<Pair<Integer,Integer>>,E>> computeGlobalSeparatorList(){
    List<Pair<List<Pair<Integer,Integer>>,E>> globalSeparatorList = new ArrayList<>();
        for(E edge : graph.edgeSet()){
            if(!isCircle(edge)){
                List<Pair<Integer,Integer>> minimalSeparators = new ArrayList<>();
                for(Integer vertex : graph.neighborSetOf(edge)){
                    List<Pair<Integer,Integer>> separators = computeMinimalSeparators(vertex, edge);
                    minimalSeparators.addAll(separators);
                }
                globalSeparatorList.add(new Pair<>(minimalSeparators, edge));
            }
        }
        return globalSeparatorList;
    }
}
