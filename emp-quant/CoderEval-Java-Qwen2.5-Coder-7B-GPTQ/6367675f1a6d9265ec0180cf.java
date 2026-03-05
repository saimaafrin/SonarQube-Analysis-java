private static <V,E>boolean isClique(Graph<V,E> graph,Set<V> vertices){
for(V v1:vertices){
        for(V v2:v1){
            if(!vertices.contains(v2)){
                return false;
            }
        }
    }
    return true;
}