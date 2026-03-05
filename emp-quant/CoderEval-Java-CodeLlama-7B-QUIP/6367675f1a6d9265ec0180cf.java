class Generated {
    private static <V,E>boolean isClique(Graph<V,E> graph,Set<V> vertices){
    if(vertices.size()==0)return false;
    	Set<E> edges=new HashSet<E>();
    	for(V v:vertices){
    		edges.addAll(graph.getOutEdges(v));
    	}
    	return edges.size()==vertices.size();
    }
}
