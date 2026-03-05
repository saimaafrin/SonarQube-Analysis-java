class Generated {
    private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
    int c=bb.get(i);
    	if(c<0){
    		int j=i+1;
    		int k=j+1;
    		int l=k+1;
    		if(j<bb.limit()&&(c&0xC0)==0x80){
    			if((bb.get(j)&0xC0)==0x80){
    				if((bb.get(k)&0xC0)==0x80){
    					if((bb.get(l)&0xC0)==0x80){
    						sb.append((char)((c&0x07)<<18|(bb.get(j)&0x3F)<<12|(bb.get(k)&0x3F)<<6|(bb.get(l)&0x3F)));
    						return l+1;
    					}
    					sb.append((char)((c&0x07)<<18|(bb.get(j)&0x3F)<<12|(bb.get(k)&0x3F)<<6));
    					return k+1;
    				}
    				sb.append((char)((c&0x07)<<18|(bb.get(j)&0x3F)<<12));
    				return j+1;
    			}
    			sb.append((char)((c&0x07)<<18));
    			return j;
    		}
    		throw new IllegalArgumentException("Invalid UTF-8 sequence");
    	}
    	sb.append((char)c);
    	return i+1;
    }
}
