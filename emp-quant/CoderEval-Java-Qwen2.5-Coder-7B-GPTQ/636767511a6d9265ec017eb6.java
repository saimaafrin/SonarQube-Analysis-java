private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
OuterFaceCirculator c = new OuterFaceCirculator(start,dir);
    while(!c.isDone() && !predicate.test(c.node())){
        c.advance();
    }
    if(c.isDone()){
        return null;
    }else{
        return c;
    }
}