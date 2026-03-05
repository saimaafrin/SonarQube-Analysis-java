public void init(){
if(this.isInitialized()){
		return;
	}
	this.setInitialized(true);
	this.setDirectory(new File(this.getDirectoryPath()));
	if(!this.getDirectory().exists()){
		this.getDirectory().mkdirs();
	}
}