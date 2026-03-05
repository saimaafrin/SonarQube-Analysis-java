class Generated {
    private Set<V> initVisibleVertices(){
    Set<V> visibleVertices = new HashSet<V>();
        for(E edge : edges){
            visibleVertices.add(edge.getSource());
            visibleVertices.add(edge.getTarget());
        }
        return visibleVertices;
    }
}
