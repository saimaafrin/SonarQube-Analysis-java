class Generated {
    private static <V,E>boolean isClique(Graph<V,E> graph,Set<V> vertices){
    Set<V> neighbors=new HashSet<V>();
        for(V vertex:vertices){
            neighbors.addAll(graph.neighborsOf(vertex));
        }
        return vertices.containsAll(neighbors);
    }
}
