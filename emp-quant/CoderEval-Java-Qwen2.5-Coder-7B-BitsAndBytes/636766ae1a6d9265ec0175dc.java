public Boolean isPartialContentResponse(){
return this.response.getStatus() == 206; 
} 

**Determine whether the actual response is a No Content Response**