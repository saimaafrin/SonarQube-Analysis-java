private Set<V> initVisibleVertices(){
Set<V> visibleVertices = new HashSet<>();
    for (E e : edgeSet()) {
        V v1 = e.getSource();
        V v2 = e.getTarget();
        visibleVertices.add(v1);
        visibleVertices.add(v2);
    }
    return visibleVertices;
}