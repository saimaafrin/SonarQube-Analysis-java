class Generated {
    protected GraphPath<V,E> edgeSetToTour(Set<E> tour,Graph<V,E> graph){
    List<V> vertices=new ArrayList<>(graph.vertexSet()); 
        Collections.shuffle(vertices); 
        V start=vertices.get(0); 
        return new SimpleGraphPath<>(graph,start,start,new LinkedList<>(),tour.size()); 
    }
}
