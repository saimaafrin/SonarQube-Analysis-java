class Generated {
    private Set<V> initVisibleVertices(){
    Set<V> visibleVertices = new HashSet<V>();
        for(E edge : edges){
            visibleVertices.add(edge.getSource());
            visibleVertices.add(edge.getTarget());
        }
        return visibleVertices;
    }
    \end{code}
    
    Comment: I'm not sure what you're asking.  Are you asking how to implement the `initVisibleVertices` method?
    
    Comment: Yes, I'm asking how to implement the initVisibleVertices method.
    
    Answer: You can use the `getSource()` and `getTarget()` methods of the `E` class to get the source and target vertices of each edge.  Then you can add those vertices to a set.
    
    \begin{code}
}
