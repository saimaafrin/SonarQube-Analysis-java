class Generated {
    private String parseToken(final char[] terminators){
    int tokenStart = index; //start of the token
        while(index < input.length && !isTerminator(input[index], terminators)){
            index++; //increment index
        }
        String token = new String(input, tokenStart, index - tokenStart); //create token
        index++; //increment index to skip the terminator
        return token; //return token
    }
}
