class Generated {
    public void removeFromTreeEdgeList(){
    if (this.parent != null){
            this.parent.childList.remove(this);
        }
        if (this.child != null){
            this.child.parent = null;
        }
    }
}
