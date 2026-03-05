class Generated {
    private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
    OuterFaceCirculator cir=new OuterFaceCirculator(start,stop,dir);
        while(cir.hasNext()){
            Node n=cir.next();
            if(predicate.apply(n))
                return cir;
        }
        return null;
    }
}
