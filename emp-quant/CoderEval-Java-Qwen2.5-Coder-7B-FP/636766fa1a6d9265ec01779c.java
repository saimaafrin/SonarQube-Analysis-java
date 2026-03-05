class Generated {
    private String parseToken(final char[] terminators){
    StringBuilder sb = new StringBuilder();
        while (this.pos < this.input.length && !isTerminator(this.input[this.pos], terminators)){
            sb.append(this.input[this.pos]);
            this.pos++;
        }
        return sb.toString();
    }
}
