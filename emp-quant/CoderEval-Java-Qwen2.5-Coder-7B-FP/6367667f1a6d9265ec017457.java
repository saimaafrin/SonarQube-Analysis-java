class Generated {
    private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
    int j=i;while(j<bb.limit()){byte b=bb.get(j);if((b&0x80)==0){sb.append((char)b);j++;}else if((b&0xE0)==0){if(j+1>=bb.limit())return -1;sb.append((char)(((b&0x1F)<<6)|(bb.get(++j)&0x3F)));j++;}else if((b&0xF0)==0){if(j+2>=bb.limit())return -1;sb.append((char)(((b&0x0F)<<12)|((bb.get(++j)&0x3F)<<6)|(bb.get(++j)&0x3F)));j++;}else return -1;}return j;}
}
