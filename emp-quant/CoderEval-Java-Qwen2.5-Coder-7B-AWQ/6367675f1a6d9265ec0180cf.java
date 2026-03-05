class Generated {
    private static <V,E>boolean isClique(Graph<V,E> graph,Set<V> vertices){
    for(V v1:vertices)  
            for(V v2:v1)  
                if(!vertices.contains(v2))  
                    return false;  
        return true;  
    }  
    
    **Explanation:** The function `isClique` checks whether a subset of vertices in a graph forms a clique. A clique is a subset of vertices where every vertex is connected to every other vertex in the subset.
    
    Here's how the function works:
    - It takes two parameters: a graph and a set of vertices.
    - It iterates over each pair of vertices `(v1, v2)` within the given set of vertices.
    - For each pair, it checks if there is an edge between `v1` and `v2`. If there isn't, it means that not all vertices are connected to each other, so the function returns `false`.
    - If the loop completes without finding any unconnected pairs, the function returns `true`, indicating that the subset of vertices forms a clique.
    
    This function assumes that the graph is undirected and that the vertices are part of the graph. If these assumptions do not hold, additional checks or modifications may be necessary.
}
