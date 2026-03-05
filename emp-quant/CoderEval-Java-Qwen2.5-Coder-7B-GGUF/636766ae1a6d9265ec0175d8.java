private String buildContentRange(){
int count = this.getCount();  
    int offset = this.getOffset();  
    int limit = this.getLimit();  
    if(limit == 0){  
        limit = count - 1;  
    }  
    return "Content-Range: items " + offset + "-" + limit + "/" + count;  
}  

**Created Question**:
What is the purpose of the `buildContentRange` method in the given code snippet?

**Created Answer**:
The purpose of the `buildContentRange` method is to generate a string that represents the content range of a resource, including the offset, limit, and total count. This string is typically used in HTTP headers to indicate the portion of a resource that is being returned in a response. If the limit is zero, it is set to the total count minus one, effectively indicating that the entire resource is being returned.