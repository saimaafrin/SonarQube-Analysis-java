class Generated {
    private static <V,E>boolean isClique(Graph<V,E> graph,Set<V> vertices){
    if(vertices.size()<2) return false;
        Set<V> neighbors=new HashSet<V>();
        for(V vertex:vertices){
            neighbors.addAll(graph.getNeighbors(vertex));
        }
        return vertices.containsAll(neighbors);
    }
}
