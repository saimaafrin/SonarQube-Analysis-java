class Generated {
    private String buildContentRange(){
    int count = this.getCount();  
        if(count == 0){  
            return "Content-Range: */0";  
        }  
        int offset = this.getOffset();  
        int limit = this.getLimit();  
        if(limit == 0){  
            limit = count - 1;  
        }  
        return "Content-Range: bytes " + offset + "-" + limit + "/" + count;  
    }  
    
    **Explanation**:
    The function `buildContentRange` constructs a HTTP header field named "Content-Range". This field specifies the range of bytes in a resource that are being transferred. It includes the start byte, end byte, and total number of bytes.
    
    Here's how it works:
    1. **Initialization**: The function starts by getting the total number of bytes (`count`) using `this.getCount()`. If there are no bytes (`count == 0`), it returns a simple "Content-Range" header indicating that the resource has no bytes.
    
    2. **Offset and Limit**: It then retrieves the starting byte position (`offset`) and the number of bytes to include in the response (`limit`). If `limit` is zero, it sets `limit` to `count - 1`, meaning the entire resource will be returned.
    
    3. **Building the Header**: Finally, it constructs the "Content-Range" header string using the calculated values. The format is "bytes {offset}-{limit}/{count}", where `{offset}` is the starting byte, `{limit}` is the ending byte, and `{count}` is the total number of bytes in the resource.
    
    This function is useful in scenarios where you need to implement partial content requests (e.g., in file downloads or streaming services).
}
