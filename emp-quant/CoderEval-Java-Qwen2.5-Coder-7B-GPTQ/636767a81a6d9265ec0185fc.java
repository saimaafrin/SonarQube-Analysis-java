public int readTag() throws IOException {
// Read one byte from input stream
    int b = in.read();  
    if (b == -1) {  
        return 0;  
    }  
    // Shift left by TAG_TYPE_BITS bits and add the new byte
    currentTag <<= TAG_TYPE_BITS;  
    currentTag |= (b & 0xFF);  
    // If the most significant bit of the currentTag is set, it means we have reached the end of the tag
    if ((currentTag >>> (TAG_TYPE_BITS + 3)) != 0) {  
        throw new IOException("Invalid tag");  
    }  
    // Return the tag
    return currentTag;  
}  

**The code above is used to read a field tag from an input stream. The function reads one byte at a time and shifts the current tag left by TAG_TYPE_BITS bits before adding the new byte. If the most significant bit of the current tag is set, it means that we have reached the end of the tag and an exception is thrown. Otherwise, the function returns the tag.**

**The code below is used to write a field tag to an output stream. The function writes the tag to the output stream in chunks of TAG_TYPE_BITS bits. If the tag is not a multiple of TAG_TYPE_BITS bits, the remaining bits are written as zeros.**

```java