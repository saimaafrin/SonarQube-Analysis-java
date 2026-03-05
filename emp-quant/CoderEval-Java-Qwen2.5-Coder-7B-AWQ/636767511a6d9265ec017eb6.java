private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
if(start==null || stop==null) return null;
    int i=0; //number of nodes traversed
    Node current=start;
    while(current!=stop){
        if(predicate.test(current)) return new OuterFaceCirculator(current,start,stop,dir);
        current=current.getOpposite().getNext(dir);
        i++;
        if(i>1000000) throw new RuntimeException("Too many iterations");
    }
    return null;
}