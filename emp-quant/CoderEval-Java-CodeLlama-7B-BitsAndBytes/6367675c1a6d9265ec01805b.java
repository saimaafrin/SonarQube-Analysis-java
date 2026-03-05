class Generated {
    public void removeFromTreeEdgeList(){
    if(prev != null)
    		prev.next = next;
    	if(next != null)
    		next.prev = prev;
    	prev = null;
    	next = null;
    }
}
