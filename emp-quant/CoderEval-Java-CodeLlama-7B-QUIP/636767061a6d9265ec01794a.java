public static int indexOfExtension(String filename){
int i = filename.length() - 1;
	while(i > 0 && filename.charAt(i) == '.'){
		i--;
	}
	while(i > 0 && filename.charAt(i) != '.'){
		i--;
	}
	return i;
}