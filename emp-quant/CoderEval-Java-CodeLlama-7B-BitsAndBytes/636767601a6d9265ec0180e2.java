class Generated {
    private List<Pair<List<Pair<Integer,Integer>>,E>> computeGlobalSeparatorList(){
    List<Pair<List<Pair<Integer,Integer>>,E>> returnList = new ArrayList<Pair<List<Pair<Integer,Integer>>,E>>();
    	for(E e : graph.edgeSet()){
    		if(e.getSource().equals(e.getTarget())){
    			continue;
    		}
    		List<Pair<Integer,Integer>> separatorList = new ArrayList<Pair<Integer,Integer>>();
    		List<Integer> separatorList2 = new ArrayList<Integer>();
    		for(E e2 : graph.edgeSet()){
    			if(e2.getSource().equals(e2.getTarget())){
    				continue;
    			}
    			if(e2.getSource().equals(e.getSource()) || e2.getSource().equals(e.getTarget()) || e2.getTarget().equals(e.getSource()) || e2.getTarget().equals(e.getTarget())){
    				continue;
    			}
    			if(graph.containsEdge(e2.getSource(), e.getSource()) && graph.containsEdge(e2.getSource(), e.getTarget()) && graph.containsEdge(e2.getTarget(), e.getSource()) && graph.containsEdge(e2.getTarget(), e.getTarget())){
    				separatorList.add(new Pair<Integer,Integer>(e2.getSource(), e2.getTarget()));
    				separatorList2.add(e2.getSource());
    				separatorList2.add(e2.getTarget());
    			}
    		}
    		returnList.add(new Pair<List<Pair<Integer,Integer>>,E>(separatorList, e));
    	}
    	return returnList;
    }
}
