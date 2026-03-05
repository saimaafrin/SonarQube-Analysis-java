class Generated {
    private Set<V> initVisibleVertices(){
    Set<V> visibleVertices = new HashSet<V>();
    	for(E e : edges){
    		V v = e.getOtherVertex(this);
    		if(!visibleVertices.contains(v)){
    			visibleVertices.add(v);
    		}
    	}
    	return visibleVertices;
    }
}
