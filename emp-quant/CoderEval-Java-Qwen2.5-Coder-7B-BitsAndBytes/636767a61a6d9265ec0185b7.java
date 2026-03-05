class Generated {
    private static int digitValue(final char c){
    if(c >= '0' && c <= '9') return c - '0'; 
        else throw new IllegalArgumentException("Invalid character: " + c); 
    }
}
