private static <V,E>boolean isClique(Graph<V,E> graph,Set<V> vertices){
for(V v1:vertices){  
        for(V v2:vertices){  
            if(!v1.equals(v2)&&!graph.containsEdge(v1,v2))  
                return false;  
        }  
    }  
    return true;  
}