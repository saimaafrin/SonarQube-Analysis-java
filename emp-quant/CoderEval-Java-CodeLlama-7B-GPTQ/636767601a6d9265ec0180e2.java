private List<Pair<List<Pair<Integer,Integer>>,E>> computeGlobalSeparatorList(){
List<Pair<List<Pair<Integer,Integer>>,E>> ret = new ArrayList<Pair<List<Pair<Integer,Integer>>,E>>();
	for(E e:graph.getEdges()){
		if(e.getType()!=EdgeType.CIRCLE){
			List<Pair<Integer,Integer>> sepList = computeMinimalSeparatorList(e);
			ret.add(new Pair<List<Pair<Integer,Integer>>,E>(sepList,e));
		}
	}
	return ret;
}