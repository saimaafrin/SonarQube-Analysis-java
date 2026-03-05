private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
int c;
	while(i<bb.limit()){
		c=bb.get(i++);
		if(c==0xE0){
			if(i+1>=bb.limit()){
				return i;
			}
			c=c<<8|bb.get(i++);
			if(c==0xE0){
				if(i+1>=bb.limit()){
					return i;
				}
				c=c<<8|bb.get(i++);
				if(c==0xE0){
					if(i+1>=bb.limit()){
						return i;
					}
					c=c<<8|bb.get(i++);
					if(c==0xE0){
						if(i+1>=bb.limit()){
							return i;
						}
						c=c<<8|bb.get(i++);
						if(c==0xE0){
							if(i+1>=bb.limit()){
								return i;
							}
							c=c<<8|bb.get(i++);
							if(c==0xE0){
								if(i+1>=bb.limit()){
									return i;
								}
								c=c<<8|bb.get(i++);
								if(c==0xE0){
									if(i+1>=bb.limit()){
										return i;
									}
}}}}}}}}}