class Generated {
    private String parseToken(final char[] terminators){
    final StringBuilder token = new StringBuilder();
        while(true){
            final char c = next();
            if(c == EOF){
                break;
            }
            if(c == '\n'){
                line++;
                column = 0;
            }
            column++;
            if(Arrays.binarySearch(terminators, c) >= 0){
                break;
            }
            token.append(c);
        }
        return token.toString();
    }
}
