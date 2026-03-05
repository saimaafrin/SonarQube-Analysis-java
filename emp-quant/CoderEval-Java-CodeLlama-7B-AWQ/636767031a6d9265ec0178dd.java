public long contentLength(){
try{
        return Long.parseLong(this.getHeader("Content-Length"));
    }catch(NumberFormatException e){
        return this.getContent().length;
    }
}