class Generated {
    private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
    int c=bb.get(i);if(c<128){sb.append((char)c);return i+1;}else if(c<224){int d=bb.get(i+1);if(d>=128&&d<192){c=((c&31)<<6)|(d&63);sb.append((char)c);return i+2;}}else if(c<240){int d=bb.get(i+1),e=bb.get(i+2);if(d>=128&&d<192&&e>=128&&e<192){c=((c&15)<<12)|((d&63)<<6)|(e&63);sb.append((char)c);return i+3;}}else if(c<248){int d=bb.get(i+1),e=bb.get(i+2),f=bb.get(i+3);if(d>=128&&d<192&&e>=128&&e<192&&f>=128&&f<192){c=((c&7)<<18)|((d&63)<<12)|((e&63)<<6)|(f&63);sb.appendCodePoint(c);return i+4;}}throw new IllegalArgumentException("Invalid UTF-8 sequence at "+i);}
}
