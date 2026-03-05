public void overrideName(String oldName,String newName){
if(oldName.equals(newName)){
		return;
	}
	for(int i=0;i<column.size();i++){
		if(column.get(i).equals(oldName)){
			column.set(i, newName);
		}
	}
}