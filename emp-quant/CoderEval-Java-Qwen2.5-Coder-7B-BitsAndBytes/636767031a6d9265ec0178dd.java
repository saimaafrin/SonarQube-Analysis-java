public long contentLength(){
try{
        String content = this.headers.get("Content-Length");
        return Long.parseLong(content);
    }catch(NumberFormatException e){
        return -1;
    }
}