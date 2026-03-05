class Generated {
    private List<Pair<List<Pair<Integer,Integer>>,E>> computeGlobalSeparatorList(){
    List<Pair<List<Pair<Integer,Integer>>,E>> returnList = new ArrayList<Pair<List<Pair<Integer,Integer>>,E>>();
    	for(E edge : graph.edgeSet()){
    		if(!(edge instanceof Circle)){
    			List<Pair<Integer,Integer>> minimalSeparatorList = computeMinimalSeparatorList(edge);
    			returnList.add(new Pair<List<Pair<Integer,Integer>>,E>(minimalSeparatorList,edge));
    		}
    	}
    	return returnList;
    }
}
