class Generated {
    private Set<V> initVisibleVertices(){
    Set<V> visibleVertices = new HashSet<V>();
        for (E e : edges) {
            V v1 = e.getVertex1();
            V v2 = e.getVertex2();
            visibleVertices.add(v1);
            visibleVertices.add(v2);
        }
        return visibleVertices;
    }
}
