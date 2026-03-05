public String toString(){
String s = "";
	for(int i = 0; i < this.length; i++){
		s += this.values[i];
		if(i < this.length - 1){
			s += ", ";
		}
	}
	return s;
}