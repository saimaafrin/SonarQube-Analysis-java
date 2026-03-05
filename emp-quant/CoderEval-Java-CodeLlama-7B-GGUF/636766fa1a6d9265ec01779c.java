class Generated {
    private String parseToken(final char[] terminators){
    final StringBuilder token = new StringBuilder();
        while(true){
            final char c = next();
            if(c == EOF){
                return token.toString();
            }
            if(Arrays.binarySearch(terminators, c) >= 0){
                return token.toString();
            }
            token.append(c);
        }
    }
}
