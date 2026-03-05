class Generated {
    private String buildContentRange(){
    long offset = this.offset;  
        long limit = this.limit;  
        long count = this.count;  
        long upperBound = limit == 0 ? count - 1 : limit;  
        return "bytes " + offset + "-" + upperBound + "/" + count;  
    }  
    
    **The following is the code that calls the above method:**
    
    ```java
}
