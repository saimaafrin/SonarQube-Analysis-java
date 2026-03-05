private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
OuterFaceCirculator circulator = new OuterFaceCirculator(start,dir);
    while(circulator.node() != stop){
        if(predicate.test(circulator.node())){
            return circulator;
        }
        circulator = circulator.next();
    }
    return null;
}