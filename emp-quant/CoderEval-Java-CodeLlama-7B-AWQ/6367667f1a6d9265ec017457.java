class Generated {
    private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
    int c=bb.get(i);
    	if(c<0){
    		c=c&0x7F;
    		if(c<0x20){
    			throw new IllegalArgumentException("Invalid UTF-8 sequence");
    		}
    		if(c<0x80){
    			sb.append((char)c);
    			return i+1;
    		}
    		if(c<0xC0){
    			throw new IllegalArgumentException("Invalid UTF-8 sequence");
    		}
    		if(c<0xE0){
    			if(i+1>=bb.limit()){
    				throw new IllegalArgumentException("Invalid UTF-8 sequence");
    			}
    			int c2=bb.get(i+1);
    			if(c2<0x80||c2>=0xC0){
    				throw new IllegalArgumentException("Invalid UTF-8 sequence");
    			}
    			sb.append((char)(((c&0x1F)<<6)|(c2&0x3F)));
    			return i+2;
    		}
    		if(c<0xF0){
    			if(i+2>=bb.limit()){
    				throw new IllegalArgumentException("Invalid UTF-8 sequence");
    			}
    			int c2=bb.get(i+1);
    			int c3=bb.get(i+2);
    			if(c2<0x80||c2>=0xC0||c3<0x80||c3>=0xC0){
    				throw new IllegalArgumentException("Invalid UTF-8 sequence");
    			}
    			sb.append((char)(((c&0x0F)<<12)|((c2&0x3F)<<6)|(c3&0x3F)));
    			return i+3;
    		}
    		if(c<0xF5){
    			if(i+3>=bb
    }}}
}
