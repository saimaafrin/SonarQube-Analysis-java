public static int computeUTF8Size(final CharSequence str,final int index,final int len){
if(str==null||index<0||len<=0||index+len>str.length()){  
        throw new IllegalArgumentException("Invalid arguments");  
    }  
    int size=0;  
    for(int i=index;i<index+len;i++){  
        char c=str.charAt(i);  
        if(c>=0&&c<=127){  
            size+=1;  
        }else if(c>=194&&c<=223){  
            size+=2;  
        }else if(c>=224&&c<=239){  
            size+=3;  
        }else if(c>=240&&c<=247){  
            size+=4;  
        }else{  
            throw new IllegalArgumentException("Invalid UTF-8 character");  
        }  
    }  
    return size;  
}  

**Explanation:**
The function `computeUTF8Size` calculates the total number of bytes required to represent a portion of a UTF-8 encoded string. It takes three parameters:
- `str`: The input string.
- `index`: The starting index from which to begin counting characters.
- `len`: The number of characters to consider from the start index.

Here's how it works:
1. **Input Validation**: The function first checks if the input parameters are valid. If not, it throws an `IllegalArgumentException`.
2. **Initialization**: A variable `size` is initialized to zero. This will hold the total byte count.
3. **Loop Through Characters**: The function iterates over each character in the specified range (`index` to `index + len`).
   - For each character, it determines the number of bytes it occupies based on its Unicode value:
     - Characters in the ASCII range (0-127) occupy 1 byte.
     - Characters in the range 194-223 occupy 2 bytes.
     - Characters in the range 224-239 occupy 3 bytes.
     - Characters in the range 240-247 occupy 4 bytes.
   - If a character falls outside these ranges, indicating an invalid UTF-8 character, the function throws an exception.
4. **Return Result**: After processing all characters, the function returns the total byte count stored in `size`.

This function is useful for determining the memory footprint of a substring when dealing with UTF-8 encoded strings, especially in scenarios where precise byte counts are necessary for data transmission or