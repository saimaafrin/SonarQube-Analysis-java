private String parseToken(final char[] terminators){
final StringBuilder token = new StringBuilder();
    while(true){
        final char c = this.next();
        if(c == '\0'){
            return null;
        }
        if(Arrays.binarySearch(terminators, c) >= 0){
            this.back();
            return token.toString();
        }
        token.append(c);
    }
}