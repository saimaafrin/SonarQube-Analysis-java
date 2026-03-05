class Generated {
    private static boolean isHex(final char c){
    return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F');  
    }  
    
    **Explanation:**
    The function `isHex` checks whether a given character `c` is a hexadecimal digit. A hexadecimal digit includes numbers from 0 to 9 and letters from both lowercase ('a' to 'f') and uppercase ('A' to 'F'). The function returns `true` if the character falls within any of these ranges, indicating it is a valid hexadecimal digit, and `false` otherwise.
}
