class Generated {
    @Override protected V provideNextVertex(){
    if(this.currentVertex==null){
    		this.currentVertex=this.graph.getFirstVertex();
    		return this.currentVertex;
    	}
    	if(this.currentVertex.getNextVertex()!=null){
    		this.currentVertex=this.currentVertex.getNextVertex();
    		return this.currentVertex;
    	}
    	return null;
    }
}
