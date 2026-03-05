private String parseToken(final char[] terminators){
final StringBuilder token = new StringBuilder();
	while(true){
		final char c = nextChar();
		if(c == '\0'){
			throw new RuntimeException("Unexpected end of input");
		}
		if(Arrays.binarySearch(terminators, c) >= 0){
			break;
		}
		token.append(c);
	}
	return token.toString();
}