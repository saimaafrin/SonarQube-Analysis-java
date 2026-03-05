class Generated {
    private static <V,E>boolean isClique(Graph<V,E> graph,Set<V> vertices){
    if(vertices.size()==0) return false;
        if(vertices.size()==1) return true;
        for(V v:vertices){
            if(!graph.containsVertex(v)) return false;
        }
        for(V v:vertices){
            for(V u:vertices){
                if(v.equals(u)) continue;
                if(!graph.containsEdge(v,u)) return false;
            }
        }
        return true;
    }
}
