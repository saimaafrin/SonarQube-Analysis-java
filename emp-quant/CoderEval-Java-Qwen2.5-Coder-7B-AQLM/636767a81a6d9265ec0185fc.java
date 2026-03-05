public int readTag() throws IOException {
int tag = readVarint();  
    if (tag == 0) {  
        throw new IOException("Unexpected EOF");  
    }  
    if ((tag >>> TAG_TYPE_BITS) == 0) {  
        throw new IOException("Invalid tag");  
    }  
    return tag;  
}  

**The readVarint() method is defined as follows:**
```java