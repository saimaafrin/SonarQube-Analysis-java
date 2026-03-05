class Generated {
    private static <V,E>boolean isClique(Graph<V,E> graph,Set<V> vertices){
    for(V v1:vertices){  
            for(V v2:vertices){  
                if(!v1.equals(v2)&&!graph.containsEdge(v1,v2))  
                    return false;  
            }  
        }  
        return true;  
    }  
    
    **Explanation**:
    The function `isClique` checks if a given set of vertices forms a clique in a graph. A clique is a subset of vertices of an undirected graph such that every two distinct vertices in the clique are adjacent. The function iterates over each pair of vertices in the given set. If any pair of vertices is not connected by an edge, the function returns `false`, indicating that the set of vertices does not form a clique. If all pairs of vertices are connected by an edge, the function returns `true`, indicating that the set of vertices forms a clique.
}
