public long contentLength(){
String contentLength = this.getHeader("Content-Length");
    if(contentLength == null){
        return 0;
    }
    try{
        return Long.parseLong(contentLength);
    }catch(NumberFormatException e){
        return 0;
    }
}