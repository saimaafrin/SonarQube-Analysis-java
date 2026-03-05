private static boolean isHex(final char c){
return (c >= '0' && c <= '9') || (c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f');  
}  

**Explanation:**
The function `isHex` checks whether a given character `c` is a hexadecimal digit. Hexadecimal digits include numbers from 0 to 9 and letters from A to F (both uppercase and lowercase).

Here's how it works:
- The first condition `(c >= '0' && c <= '9')` checks if the character is a numeric digit.
- The second condition `(c >= 'A' && c <= 'F')` checks if the character is an uppercase letter between A and F.
- The third condition `(c >= 'a' && c <= 'f')` checks if the character is a lowercase letter between a and f.

If any of these conditions are true, the function returns `true`, indicating that the character is a hexadecimal digit. Otherwise, it returns `false`.