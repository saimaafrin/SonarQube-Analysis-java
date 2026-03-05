class Generated {
    private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
    OuterFaceCirculator circulator=new OuterFaceCirculator(this,start,stop,dir);
    	while(circulator.hasNext()){
    		Node node=circulator.next();
    		if(predicate.test(node)) return circulator;
    	}
    	return null;
    }
}
