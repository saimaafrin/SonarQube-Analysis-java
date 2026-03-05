public static int computeUTF8Size(final CharSequence str,final int index,final int len){
int size=0;
	for(int i=index;i<index+len;i++){
		final char c=str.charAt(i);
		if(c<0x80){
			size++;
		}else if(c<0x800){
			size+=2;
		}else if(c<0x10000){
			size+=3;
		}else if(c<0x200000){
			size+=4;
		}else if(c<0x4000000){
			size+=5;
		}else{
			size+=6;
		}
	}
	return size;
}