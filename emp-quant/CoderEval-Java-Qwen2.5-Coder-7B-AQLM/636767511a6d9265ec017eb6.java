class Generated {
    private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
    OuterFaceCirculator circulator = new OuterFaceCirculator(start,stop,dir);
        while(!predicate.test(circulator.node()) && circulator.node() != stop){
            circulator.move();
        }
        return circulator;
    }
}
