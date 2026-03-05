private static <V,E>boolean isClique(Graph<V,E> graph,Set<V> vertices){
if(vertices.size()==0) return false;
    for(V v:vertices){
        if(vertices.size()==1) return true;
        for(V u:vertices){
            if(u.equals(v)) continue;
            if(!graph.containsEdge(v,u)) return false;
        }
    }
    return true;
}