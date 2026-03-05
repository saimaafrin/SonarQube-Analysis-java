private static boolean isHex(final char c){
return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F');  
}  

**Explanation:**
The function `isHex` checks whether a given character `c` is a hexadecimal digit. Hexadecimal digits include numbers from 0 to 9 and letters from 'a' to 'f' (both lowercase and uppercase). The function uses three conditions combined with logical OR (`||`) to determine if the character falls within any of these ranges:

1. `(c >= '0' && c <= '9')`: This condition checks if the character is between '0' and '9', inclusive.
2. `(c >= 'a' && c <= 'f')`: This condition checks if the character is between 'a' and 'f', inclusive.
3. `(c >= 'A' && c <= 'F')`: This condition checks if the character is between 'A' and 'F', inclusive.

If any of these conditions are true, the function returns `true`, indicating that the character is a hexadecimal digit. Otherwise, it returns `false`.