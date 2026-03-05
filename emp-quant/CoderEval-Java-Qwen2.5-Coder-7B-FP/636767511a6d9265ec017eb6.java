class Generated {
    private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
    if(start==null || stop==null) return null;
        OuterFaceCirculator c = new OuterFaceCirculator(graph,start,stop,dir);
        while(c.hasNext()){
            Node n = c.next();
            if(predicate.test(n)) return c;
        }
        return null;
    }
}
