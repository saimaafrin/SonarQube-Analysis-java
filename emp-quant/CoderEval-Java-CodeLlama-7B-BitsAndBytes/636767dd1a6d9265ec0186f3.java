class Generated {
    public void overrideName(String oldName,String newName){
    for(int i=0;i<column.size();i++){
    		if(column.get(i).equals(oldName)){
    			column.set(i, newName);
    		}
    	}
    }
}
