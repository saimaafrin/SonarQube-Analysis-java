class Generated {
    private String parseToken(final char[] terminators){
    StringBuilder token = new StringBuilder();
        while (true){
            char c = readChar();
            if (c == '\0') return token.toString();
            if (c == '\n') {
                if (token.length() == 0) continue;
                else return token.toString();
            }
            if (c == ' ') {
                if (token.length() == 0) continue;
                else return token.toString();
            }
            boolean isTerminator = false;
            for (char term : terminators){
                if (c == term) {
                    isTerminator = true;
                    break;
                }
            }
            if (isTerminator) return token.toString();
            token.append(c);
        }
    }
}
