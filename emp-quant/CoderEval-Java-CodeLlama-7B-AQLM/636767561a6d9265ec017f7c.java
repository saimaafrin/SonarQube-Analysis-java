class Generated {
    protected GraphPath<V,E> edgeSetToTour(Set<E> tour,Graph<V,E> graph){
    GraphPath<V,E> path=new GraphPathImpl<V,E>(graph);
    	for(E e:tour){
    		path.addEdge(e);
    	}
    	return path;
    }
}
