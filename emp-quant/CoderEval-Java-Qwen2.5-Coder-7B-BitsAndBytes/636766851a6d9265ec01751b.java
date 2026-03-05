private static char decodeHexNibble(final char c){
if(c >= '0' && c <= '9') return (char)(c - '0'); //If the character is a digit, subtract '0' from it to get its integer value.
    else if(c >= 'A' && c <= 'F') return (char)((c - 'A') + 10); //If the character is an uppercase letter, subtract 'A' from it and add 10 to get its integer value.
    else if(c >= 'a' && c <= 'f') return (char)((c - 'a') + 10); //If the character is a lowercase letter, subtract 'a' from it and add 10 to get its integer value.
    else throw new IllegalArgumentException("Invalid hex digit: " + c); //If the character is not a valid hex digit, throw an exception.
}