public void removeFromTreeEdgeList(){
if (this.prev != null) {
        this.prev.next = this.next;
    }
    if (this.next != null) {
        this.next.prev = this.prev;
    }
}