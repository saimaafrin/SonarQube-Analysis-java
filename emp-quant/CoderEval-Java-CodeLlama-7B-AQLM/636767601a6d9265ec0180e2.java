class Generated {
    private List<Pair<List<Pair<Integer,Integer>>,E>> computeGlobalSeparatorList(){
    List<Pair<List<Pair<Integer,Integer>>,E>> returnList = new ArrayList<Pair<List<Pair<Integer,Integer>>,E>>();
    	for(E e : graph.edgeSet()){
    		if(!(e instanceof Circle)){
    			List<Pair<Integer,Integer>> separatorList = computeSeparatorList(e);
    			returnList.add(new Pair<List<Pair<Integer,Integer>>,E>(separatorList,e));
    		}
    	}
    	return returnList;
    }
}
