class Generated {
    public void removeFromTreeEdgeList(){
    if (parent != null) {
            parent.childList.remove(this);
        }
        if (child != null){
            child.parent = null;
        }
    }
}
