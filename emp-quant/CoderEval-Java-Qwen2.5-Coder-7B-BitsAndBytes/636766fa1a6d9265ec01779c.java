private String parseToken(final char[] terminators){
StringBuilder sb = new StringBuilder();
    while (true){
        if (isTerminator(terminators)){
            break;
        }
        sb.append(currentChar());
        advance();
    }
    return sb.toString();
}