private String parseToken(final char[] terminators){
final StringBuilder token = new StringBuilder();
    char c;
    while(true){
        c = nextChar();
        if(c == EOF || inArray(c, terminators)){
            break;
        }
        token.append(c);
    }
    return token.toString();
}