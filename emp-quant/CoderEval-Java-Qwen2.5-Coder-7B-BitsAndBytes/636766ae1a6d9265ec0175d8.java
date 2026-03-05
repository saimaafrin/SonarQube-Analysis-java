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
    
    **Created Question**:
    What does the `buildContentRange` method do in terms of handling different scenarios for the offset, limit, and total count?
    
    **Created Answer**:
    The `buildContentRange` method constructs a Content-Range header value based on the current state of an object. It first checks if the count is zero, in which case it returns "Content-Range: */0". If the count is not zero, it retrieves the offset and limit values. If the limit is zero, it sets the limit to the total count minus one. Finally, it formats these values into a string following the HTTP Content-Range format, which specifies the byte range and the total number of bytes available. This method ensures that the Content-Range header is correctly formatted regardless of whether the limit was explicitly set or defaulted.
}
