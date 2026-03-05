public String toString(){
String s = "";
	for(int i = 0; i < vs.length; i++){
		s += vs[i];
		if(i < vs.length - 1)
			s += " ";
	}
	return s;
}