public boolean remove(int val){
if(map.containsKey(val)){
		map.remove(val);
		return true;
	}
	return false;
}