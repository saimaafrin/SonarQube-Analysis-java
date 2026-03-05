public static String[] addStringToArray(String[] array,String str){
if(array==null){
		array=new String[1];
	}
	String[] newArray=new String[array.length+1];
	for(int i=0;i<array.length;i++){
		newArray[i]=array[i];
	}
	newArray[newArray.length-1]=str;
	return newArray;
}