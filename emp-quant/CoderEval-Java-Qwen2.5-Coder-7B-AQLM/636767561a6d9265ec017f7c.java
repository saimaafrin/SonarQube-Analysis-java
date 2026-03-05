protected GraphPath<V,E> edgeSetToTour(Set<E> tour,Graph<V,E> graph){
List<E> tourList = new ArrayList<E>(tour); 
    List<V> tourVertices = new ArrayList<V>(); 
    tourVertices.add(tourList.get(0).getTarget()); 
    for(int i=1;i<tourList.size();i++){ 
        tourVertices.add(tourList.get(i).getTarget()); 
    } 
    return new GraphPath<V,E>(graph,tourVertices); 
}