private static <V,E>boolean isClique(Graph<V,E> graph,Set<V> vertices){
for(V v1:vertices) {  
        for(V v2:v1.getNeighbors()) {  
            if(!vertices.contains(v2)) {  
                return false;  
            }  
        }  
    }  
    return true;  
}  

**Explanation:** The function `isClique` checks whether a subset of vertices in a graph forms a clique. A clique is a subset of vertices such that every two distinct vertices in the subset are adjacent.

Here's how the function works:
1. It iterates over each vertex `v1` in the set of vertices.
2. For each vertex `v1`, it checks all its neighbors.
3. If any neighbor `v2` of `v1` is not in the set of vertices, then the subset does not form a clique, and the function returns `false`.
4. If all neighbors of every vertex in the set are also in the set, then the subset forms a clique, and the function returns `true`.

This implementation ensures that the function correctly identifies whether the given subset of vertices forms a clique in the graph.