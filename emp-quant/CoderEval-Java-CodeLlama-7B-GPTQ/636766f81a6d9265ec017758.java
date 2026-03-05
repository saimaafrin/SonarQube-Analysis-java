@Override public int hashCode(){
int hash = 1;
	hash = hash * 31 + (this.type == null ? 0 : this.type.hashCode());
	return hash;
}