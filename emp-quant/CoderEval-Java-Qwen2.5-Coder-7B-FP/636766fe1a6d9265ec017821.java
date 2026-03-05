protected void appendDetail(StringBuffer buffer,String fieldName,byte[] array){
if(array==null) return;  
    buffer.append(fieldName).append("=");  
    for(int i=0;i<array.length;i++){  
        buffer.append((char)(array[i]&0xff));  
    }  
}  

**Explanation:**
The function `appendDetail` is designed to append a byte array to a `StringBuffer`. It takes three parameters:
- `buffer`: The `StringBuffer` where the data will be appended.
- `fieldName`: A string representing the name of the field being appended.
- `array`: The byte array that needs to be appended.

Here's how it works:
1. **Null Check**: If the `array` is null, the function returns immediately without doing anything.
2. **Appending Field Name**: The function appends the `fieldName` followed by an equals sign (`=`) to the `buffer`.
3. **Iterating Through Array**: It then iterates through each element in the `array`.
4. **Applying Bitwise AND and Casting**: For each byte in the array, it applies a bitwise AND operation with `0xff` to ensure that the byte is treated as an unsigned value. This is necessary because Java bytes are signed by default.
5. **Casting to Character**: The result of the bitwise AND operation is cast to a `char`, which effectively converts the byte to its corresponding ASCII character.
6. **Appending Character**: Finally, this character is appended to the `buffer`.

This function is useful for creating formatted strings from binary data, such as when logging or displaying detailed information about network packets or other binary structures.