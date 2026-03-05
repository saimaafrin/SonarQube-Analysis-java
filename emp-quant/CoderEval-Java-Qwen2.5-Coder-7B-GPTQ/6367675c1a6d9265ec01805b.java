public void removeFromTreeEdgeList(){
if (parent != null) {
        parent.childEdges.remove(this);
    }
    if (child != null) {
        child.parentEdges.remove(this);
    }
}