public void removeFromTreeEdgeList(){
if (parent != null) {
        parent.childList.remove(this);
    }
    if (child != null) {
        child.parentList.remove(this);
    }
}