public Boolean isPartialContentResponse(){
return this.response.getStatusLine().getStatusCode() == HttpStatus.SC_PARTIAL_CONTENT;  
}  

**Determine whether the actual response is a Not Modified Response**