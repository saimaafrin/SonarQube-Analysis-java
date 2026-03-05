class Generated {
    public static int computeUTF8Size(final CharSequence str,final int index,final int len){
    int size=0;
    	for(int i=index;i<index+len;i++){
    		final char c=str.charAt(i);
    		if(c<0x80){
    			size++;
    		}else if(c<0x800){
    			size+=2;
    		}else if(c<0xD800||c>0xDFFF){
    			size+=3;
    		}else{
    			i++;
    			size+=4;
    		}
    	}
    	return size;
    }
}
