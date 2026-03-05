protected GraphPath<V,E> edgeSetToTour(Set<E> tour,Graph<V,E> graph){
List<E> tourList = new ArrayList<>(tour); 
    tourList.add(tourList.get(0)); 
    return new GraphWalk<>(graph,tourList); 
}