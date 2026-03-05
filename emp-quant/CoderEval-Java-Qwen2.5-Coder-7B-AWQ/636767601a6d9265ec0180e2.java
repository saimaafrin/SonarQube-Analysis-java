private List<Pair<List<Pair<Integer,Integer>>,E>> computeGlobalSeparatorList(){
List<Pair<List<Pair<Integer,Integer>>,E>> globalSeparatorList = new ArrayList<>();
    for(E e : this.edgeSet()){
        if(!isCircle(e)){
            List<Pair<Integer,Integer>> localSeparatorList = computeLocalSeparatorList(e);
            Pair<List<Pair<Integer,Integer>>,E> pair = new Pair<>(localSeparatorList,e);
            globalSeparatorList.add(pair);
        }
    }
    return globalSeparatorList;
}