class Generated {
    public static boolean isAscii(final char ch){
    return (ch & 0x80) == 0;  
    }  
    
    **Explanation:**
    - The function `isAscii` takes a single character as input.
    - It uses bitwise AND operation (`&`) to check if the most significant bit of the character is set or not.
    - If the most significant bit is not set, it means the character is an ASCII seven-bit character, and the function returns `true`.
    - Otherwise, it returns `false`.
}
