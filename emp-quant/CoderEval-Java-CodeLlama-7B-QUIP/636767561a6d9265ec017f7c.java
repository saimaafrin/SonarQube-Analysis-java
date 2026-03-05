class Generated {
    protected GraphPath<V,E> edgeSetToTour(Set<E> tour,Graph<V,E> graph){
    GraphPath<V,E> path=new GraphPath<V,E>();
    	for(E e:tour){
    		path.addEdge(e);
    	}
    	return path;
    }
}
