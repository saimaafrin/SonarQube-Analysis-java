public void removeFromTreeEdgeList(){
if(this.next != null){
		this.next.prev = this.prev;
	}
	if(this.prev != null){
		this.prev.next = this.next;
	}
	this.next = null;
	this.prev = null;
}