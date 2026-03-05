class Generated {
    private Set<V> initVisibleVertices(){
    Set<V> visibleVertices = new HashSet<>();
        for (E edge : this.getEdges()) {
            V sourceVertex = this.getSource(edge);
            V targetVertex = this.getTarget(edge);
            visibleVertices.add(sourceVertex);
            visibleVertices.add(targetVertex);
        }
        return visibleVertices;
    }
}
