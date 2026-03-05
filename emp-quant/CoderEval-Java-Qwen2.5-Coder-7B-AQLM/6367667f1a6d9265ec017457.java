class Generated {
    private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
    int j=i;int k=bb.limit();while(j<k){int m=bb.get(j);if(m<128){sb.append((char)m);j++;}else if(m<192){return i;}else if(m<224){if(j+1<k){int n=bb.get(j+1);if(n>=128&&n<192){sb.append((char)((m&31)<<6|n&63));j+=2;}else{return i;}}else{return i;}}else if(m<240){if(j+2<k){int n=bb.get(j+1);int o=bb.get(j+2);if(n>=128&&n<192&&o>=128&&o<192){sb.append((char)((m&15)<<12|(n&63)<<6|o&63));j+=3;}else{return i;}}else{return i;}}else{return i;}}return j;}
}
