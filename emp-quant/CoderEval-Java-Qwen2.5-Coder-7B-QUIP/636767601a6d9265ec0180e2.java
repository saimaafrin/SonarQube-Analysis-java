class Generated {
    private List<Pair<List<Pair<Integer,Integer>>,E>> computeGlobalSeparatorList(){
    List<Pair<List<Pair<Integer,Integer>>,E>> globalSeparatorList = new ArrayList<Pair<List<Pair<Integer,Integer>>,E>>();
        for (E e : graph.getEdges()) {
            List<Pair<Integer,Integer>> localSeparatorList = computeLocalSeparatorList(e);
            globalSeparatorList.add(new Pair<List<Pair<Integer,Integer>>,E>(localSeparatorList,e));
        }
        return globalSeparatorList;
    }
}
