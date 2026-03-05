class Generated {
    private List<Pair<List<Pair<Integer,Integer>>,E>> computeGlobalSeparatorList(){
    List<Pair<List<Pair<Integer,Integer>>,E>> returnList = new ArrayList<Pair<List<Pair<Integer,Integer>>,E>>();
    	for(E e : graph.edgeSet()){
    		if(!isCircle(e)){
    			List<Pair<Integer,Integer>> minimalSeparatorList = computeMinimalSeparatorList(e);
    			returnList.add(new Pair<List<Pair<Integer,Integer>>,E>(minimalSeparatorList,e));
    		}
    	}
    	return returnList;
    }
}
