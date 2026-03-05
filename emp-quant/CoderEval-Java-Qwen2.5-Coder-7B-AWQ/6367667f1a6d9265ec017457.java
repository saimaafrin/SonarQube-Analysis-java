private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
int j=0;while(i>0){char c=(char)bb.get();if(c<128){sb.append(c);i--;}else if(c<192){return -1;}else if(c<224){j=i-1;if(j>0){c=((c&31)<<6)|(bb.get()&63);sb.append((char)c);i-=2;}else{return -1;}}else if(c<240){j=i-2;if(j>0){c=((c&15)<<12)|((bb.get()&63)<<6)|(bb.get()&63);sb.append((char)c);i-=3;}else{return -1;}}else if(c<248){j=i-3;if(j>0){c=((c&7)<<18)|((bb.get()&63)<<12)|((bb.get()&63)<<6)|(bb.get()&63);sb.append((char)c);i-=4;}else{return -1;}}else{return -1;}}return i;}

**Created Question**:
What is the purpose of the `decodeOctets` method in the provided Java code snippet?

**Created Answer**:
The purpose of the `decodeOctets` method is to decode a sequence of octets (bytes) from a ByteBuffer into characters using UTF-8 encoding. It appends these decoded characters to a StringBuilder and returns the number of octets that were not successfully decoded due to insufficient data or invalid byte sequences. The method handles different ranges of UTF-8 encoded bytes to correctly interpret multi-byte characters and ensures that only valid UTF-8 sequences are processed.