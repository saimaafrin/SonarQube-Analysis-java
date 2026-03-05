class Generated {
    private static char decodeHexNibble(final char c){
    if(c >= '0' && c <= '9') {  
            return (char)(c - '0');  
        } else if(c >= 'A' && c <= 'F') {  
            return (char)(10 + c - 'A');  
        } else if(c >= 'a' && c <= 'f') {  
            return (char)(10 + c - 'a');  
        } else {  
            throw new IllegalArgumentException("Invalid hex digit: " + c);  
        }  
    }
}
