class Generated {
    private static char decodeHexNibble(final char c){
    if(c >= '0' && c <= '9'){
            return (char) (c - '0' + '0');
        }
        if(c >= 'a' && c <= 'f'){
            return (char) (c - 'a' + '0' + 10);
        }
        if(c >= 'A' && c <= 'F'){
            return (char) (c - 'A' + '0' + 10);
        }
        return 0;
    }
}
