public void removeFromTreeEdgeList(){
if (parent != null) {
        parent.child.remove(this);
    }
    if (child != null){
        child.parent = null;
    }
}