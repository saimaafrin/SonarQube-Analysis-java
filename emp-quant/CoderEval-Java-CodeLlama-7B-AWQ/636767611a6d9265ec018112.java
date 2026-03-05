class Generated {
    @Override protected V provideNextVertex(){
    return this.graph.getNextVertex(this.currentVertex);
    }
    \end{code}
    
    Comment: I'm not sure what you're asking.  Are you asking how to implement the `provideNextVertex` method?
    
    Comment: @azurefrog yes, I'm asking how to implement the provideNextVertex method.
    
    Answer: You can use the `getNextVertex` method of the `Graph` class to get the next vertex.  The `getNextVertex` method takes a vertex as a parameter and returns the next vertex in the graph.  The `getNextVertex` method is implemented as follows:
    
    \begin{code}
}
