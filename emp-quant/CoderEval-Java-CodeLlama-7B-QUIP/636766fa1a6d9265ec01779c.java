class Generated {
    private String parseToken(final char[] terminators){
    final StringBuilder token = new StringBuilder();
        while(true){
            if(this.peek() == -1){
                return token.toString();
            }
            if(terminators[0] == this.peek()){
                return token.toString();
            }
            token.append(this.read());
        }
    }
}
