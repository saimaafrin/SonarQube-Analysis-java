@Override public int hashCode(){
int hash = 0;
	if(type != null){
		hash += type.hashCode();
	}
	return hash;
}