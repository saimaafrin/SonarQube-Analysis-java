class Generated {
    protected GraphPath<V,E> edgeSetToTour(Set<E> tour,Graph<V,E> graph){
    GraphPath<V,E> path=new GraphPathImpl<V,E>(graph);
    	for(E edge:tour){
    		path.addEdge(edge);
    	}
    	return path;
    }
}
