public void abbreviate(final int nameStart,final StringBuffer buf){
int count=0;
	int index=nameStart;
	while(index<buf.length()){
		if(buf.charAt(index)=='.'){
			count++;
			if(count==3){
				buf.delete(nameStart,index);
				break;
			}
		}
		index++;
	}
}