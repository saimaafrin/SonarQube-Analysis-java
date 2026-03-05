class Generated {
    private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
    int c=bb.get(i);
    	if(c<0){
    		int j=i+1;
    		int k=j+1;
    		int l=k+1;
    		if(j<bb.limit()&&(c&0xE0)==0xC0&&(bb.get(j)&0xC0)==0x80){
    			if(l<bb.limit()&&(bb.get(k)&0xC0)==0x80){
    				sb.append((char)((c&0x1F)<<6|(bb.get(j)&0x3F)<<0|(bb.get(k)&0x3F)<<12));
    				return l;
    			}
    			sb.append((char)((c&0x1F)<<6|(bb.get(j)&0x3F)<<0));
    			return k;
    		}
    		if(j<bb.limit()&&(c&0xF0)==0xE0&&(bb.get(j)&0xC0)==0x80&&(bb.get(k)&0xC0)==0x80){
    			if(l<bb.limit()&&(bb.get(k)&0xC0)==0x80){
    				sb.append((char)((c&0x0F)<<12|(bb.get(j)&0x3F)<<6|(bb.get(k)&0x3F)<<0));
    				return l;
    			}
    			sb.append((char)((c&0x0F)<<12|(bb.get(j)&0x3F)<<6));
    			return k;
    		}
    		if(j<bb.limit()&&(c&0xF8)==0xF0&&(bb.get(j)&0xC0)==0x80&&(bb.get(k)&0xC0)==0x80&&(bb.get(l
    }}
}
