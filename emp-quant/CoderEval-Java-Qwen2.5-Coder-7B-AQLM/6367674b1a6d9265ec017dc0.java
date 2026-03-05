class Generated {
    private Set<V> initVisibleVertices(){
    Set<V> visibleVertices = new HashSet<V>();
        for (E e : this.getEdges()) {
            visibleVertices.add(e.getSource());
            visibleVertices.add(e.getTarget());
        }
        return visibleVertices;
    }
}
