class Generated {
    private static <V,E>boolean isClique(Graph<V,E> graph,Set<V> vertices){
    if(vertices.size()==0) return true;
        if(vertices.size()==1) return true;
        if(vertices.size()==2) return graph.containsEdge(vertices.iterator().next(),vertices.iterator().next());
        Set<V> neighbors=graph.getNeighbors(vertices.iterator().next());
        for(V v:neighbors){
            if(!vertices.contains(v)) continue;
            Set<V> newVertices=new HashSet<V>(vertices);
            newVertices.remove(v);
            if(!isClique(graph,newVertices)) return false;
        }
        return true;
    }
}
