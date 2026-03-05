public static String[] concatenateStringArrays(String[] array1,String[] array2){
String[] array3 = new String[array1.length+array2.length];
	for(int i=0;i<array1.length;i++){
		array3[i] = array1[i];
	}
	for(int i=0;i<array2.length;i++){
		array3[i+array1.length] = array2[i];
	}
	return array3;
}