public long contentLength(){
try{
        long contentLength = Long.parseLong(getHeader("Content-Length"));
        return contentLength;
    }catch(NumberFormatException e){
        return contentLength;
    }
}