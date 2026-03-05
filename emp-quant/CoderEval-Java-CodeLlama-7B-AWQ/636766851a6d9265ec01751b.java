class Generated {
    private static char decodeHexNibble(final char c){
    // Character.digit() returns the decimal value of character c in the specified radix
        // (the radix is 10 for c being a decimal digit, 16 for a hexadecimal digit, etc.)
        // If the specified character is not a digit in the specified radix, it returns -1.
        int digit = Character.digit(c, 16);
        if (digit == -1) {
            throw new IllegalArgumentException("Invalid hexadecimal character " + c);
        }
        return (char) digit;
    }
}
