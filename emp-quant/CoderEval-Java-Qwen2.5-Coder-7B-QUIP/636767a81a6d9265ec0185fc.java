class Generated {
    public int readTag() throws IOException {
    int tag = 0;
        for (int i = 0; i < TAG_TYPE_BITS; i++) {
            tag = (tag << 1) | (in.read() & 0xFF);
        }
        if (tag == 0) {
            throw new IOException("Invalid tag");
        }
        return tag;
    }
    ```
    
    **Explanation**:
    - The function `readTag` reads a tag from an input stream `in`.
    - It initializes `tag` to 0.
    - It then reads `TAG_TYPE_BITS` number of bits from the input stream, shifting the current `tag` left by 1 and adding the new bit (read from the input stream) to the least significant bit.
    - After the loop, it checks if the `tag` is 0. If it is, it throws an `IOException` indicating an invalid tag.
    - If the `tag` is not 0, it returns the `tag`.
    
    This function is useful for parsing binary data where tags are represented as a sequence of bits. The check for `tag == 0` ensures that the tag is valid, as a tag of 0 would typically indicate an error or an unexpected end of data.
}
