class Generated {
    private static char decodeHexNibble(final char c){
    return (char)((c >= '0' && c <= '9') ? c - '0' : ((c >= 'A' && c <= 'F') ? 10 + c - 'A' : ((c >= 'a' && c <= 'f') ? 10 + c - 'a' : 0)));
    }
}
