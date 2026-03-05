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
    How can you determine if a given string represents a valid integer?
    
    **Created Answer**:
    To check if a string is a valid integer, you can use the following method:
    
    ```java
}
