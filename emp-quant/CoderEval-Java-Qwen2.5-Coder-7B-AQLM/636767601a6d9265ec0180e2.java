private List<Pair<List<Pair<Integer,Integer>>,E>> computeGlobalSeparatorList(){
List<Pair<List<Pair<Integer,Integer>>,E>> globalSeparatorList = new ArrayList<>();
    for(E edge : graph.getEdges()){
        if(!isCircle(edge)){
            List<Pair<Integer,Integer>> minimalSeparators = new ArrayList<>();
            for(Integer vertex : graph.getNeighborhood(edge)){
                List<Pair<Integer,Integer>> separators = computeMinimalSeparators(vertex);
                minimalSeparators.addAll(separators);
            }
            globalSeparatorList.add(new Pair<>(minimalSeparators,edge));
        }
    }
    return globalSeparatorList;
}