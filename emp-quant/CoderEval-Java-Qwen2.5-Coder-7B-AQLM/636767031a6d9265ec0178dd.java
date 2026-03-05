public long contentLength(){
try{
        return Long.parseLong(getHeader("Content-Length"));
    }catch(NumberFormatException e){
        return Long.parseLong(getHeader("Content-Length"));
    }
}