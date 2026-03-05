public Boolean isPartialContentResponse(){
return response.getStatusCode() == HttpStatus.PARTIAL_CONTENT;
}