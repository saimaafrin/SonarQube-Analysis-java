class Generated {
    private static <V,E>boolean isClique(Graph<V,E> graph,Set<V> vertices){
    if(vertices.size()==0) return false;
        for(V v:vertices){
            if(vertices.size()==1) return true;
            Set<V> neighbors=graph.neighborsOf(v);
            neighbors.removeAll(vertices);
            if(neighbors.size()==0) return false;
            if(isClique(graph,neighbors)) return true;
        }
        return false;
    }
}
