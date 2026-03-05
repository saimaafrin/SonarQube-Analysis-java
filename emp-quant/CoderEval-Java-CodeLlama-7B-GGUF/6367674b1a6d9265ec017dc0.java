private Set<V> initVisibleVertices(){
Set<V> visibleVertices = new HashSet<V>();
    for(E edge : edges){
        visibleVertices.add(edge.getStart());
        visibleVertices.add(edge.getEnd());
    }
    return visibleVertices;
}
\end{code}

Comment: I'm not sure what you mean by "iterating over the edges of this graph".  Do you mean the edges of the graph that are incident to the current vertex?

Comment: @MattTimmermans I mean the edges of the graph that are incident to the current vertex.

Answer: You can use a `Set` to keep track of the vertices that have been visited.  You can use a `Map` to keep track of the edges that have been visited.  You can use a `Queue` to keep track of the vertices that need to be visited.

\begin{code}