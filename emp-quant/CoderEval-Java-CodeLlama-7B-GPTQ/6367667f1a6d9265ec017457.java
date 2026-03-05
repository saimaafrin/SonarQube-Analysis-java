private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
int c=bb.get(i);
	if(c<0){
		int j=i+1;
		int k=j+1;
		int l=k+1;
		if(j<bb.limit()&&k<bb.limit()&&l<bb.limit()){
			int a=bb.get(j);
			int b=bb.get(k);
			int c=bb.get(l);
			if(a>=0&&b>=0&&c>=0){
				int d=((c&0x0F)<<12)|((b&0x3F)<<6)|(a&0x3F);
				sb.append((char)d);
				return l+1;
			}
		}
		throw new IllegalArgumentException("Invalid UTF-8 sequence");
	}
	sb.append((char)c);
	return i+1;
}