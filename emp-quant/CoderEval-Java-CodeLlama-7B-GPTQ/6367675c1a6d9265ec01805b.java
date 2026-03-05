public void removeFromTreeEdgeList(){
if(this.left != null){
		this.left.right = this.right;
	}
	if(this.right != null){
		this.right.left = this.left;
	}
	this.left = null;
	this.right = null;
}