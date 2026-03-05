class Generated {
    protected GraphPath<V,E> edgeSetToTour(Set<E> tour,Graph<V,E> graph){
    List<E> edges=new ArrayList<>(tour); 
        Collections.sort(edges,new Comparator<E>(){ 
            public int compare(E e1,E e2){ 
                return Integer.compare(graph.getEdgeWeight(e1),graph.getEdgeWeight(e2)); 
            } 
        }); 
        List<V> vertices=new ArrayList<>(); 
        for(E edge:edges){ 
            V source=graph.getEdgeSource(edge); 
            V target=graph.getEdgeTarget(edge); 
            if(!vertices.contains(source)){ 
                vertices.add(source); 
            } 
            if(!vertices.contains(target)){ 
                vertices.add(target); 
            } 
        } 
        GraphPath<V,E> path=new DefaultGraphPath<>(graph,vertices,edges,false); 
        return path; 
    }
}
