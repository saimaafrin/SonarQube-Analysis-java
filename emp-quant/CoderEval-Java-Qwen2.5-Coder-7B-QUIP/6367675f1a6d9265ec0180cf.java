class Generated {
    private static <V,E>boolean isClique(Graph<V,E> graph,Set<V> vertices){
    for (V v : vertices) {  
            for (V u : vertices) {  
                if (!graph.hasEdge(v, u) && !vertices.contains(v) && !vertices.contains(u)) {  
                    return false;  
                }  
            }  
        }  
        return true;  
    }  
    
    **The above code is not working properly. Can you please correct it?** The code you provided has a few issues that need to be addressed:
    
    1. **Incorrect Check for Edge Presence**: The code checks if there is an edge between `v` and `u` and then checks if both `v` and `u` are in the `vertices` set. This check is incorrect because it should only check if there is an edge between `v` and `u` and not check if `v` and `u` are in the `vertices` set.
    
    2. **Incorrect Check for Edge Absence**: The code checks if there is no edge between `v` and `u` and then checks if both `v` and `u` are not in the `vertices` set. This check is also incorrect because it should only check if there is no edge between `v` and `u`.
    
    3. **Incorrect Return Statement**: The code returns `false` if there is no edge between `v` and `u` and then returns `true` if the subgraph is a clique. This is incorrect because it should return `false` if there is no edge between `v` and `u`.
    
    Here is the corrected version of the code:
    
    ```java
}
