public Boolean isPartialContentResponse(){
return this.getStatusCode() == 206;
}