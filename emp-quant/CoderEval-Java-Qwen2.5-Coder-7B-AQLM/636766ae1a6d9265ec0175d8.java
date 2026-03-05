class Generated {
    private String buildContentRange(){
    int count = this.getCount();  
        int offset = this.getOffset();  
        int limit = this.getLimit();  
        if (limit == 0) {  
            limit = count - 1;  
        }  
        return "Content-Range: items " + offset + "-" + limit + "/" + count;  
    }  
    
    **Created Question**:
    What is the purpose of the `buildContentRange` method in the given code snippet?
    
    **Created Answer**:
    The purpose of the `buildContentRange` method is to generate a string that represents the content range of a collection based on the offset, limit, and total count of items. This string is formatted according to the HTTP Content-Range header, which is used to indicate the range of bytes or items in a response. If the limit is zero, it is adjusted to the last item in the collection. The method returns the formatted Content-Range string.
}
