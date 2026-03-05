public void init(){
if(this.getParent()!=null){
		this.getParent().init();
	}
	this.init();
}