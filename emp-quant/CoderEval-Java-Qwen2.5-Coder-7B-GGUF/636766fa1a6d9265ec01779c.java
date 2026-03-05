class Generated {
    private String parseToken(final char[] terminators){
    StringBuilder token = new StringBuilder();
        while (this.hasNext() && !isTerminator(terminators)){
            token.append(this.next());
        }
        return token.toString();
    }
}
