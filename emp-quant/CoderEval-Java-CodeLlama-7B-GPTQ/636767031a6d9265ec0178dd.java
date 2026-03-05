class Generated {
    public long contentLength(){
    try{
            return Long.parseLong(getHeader("Content-Length"));
        }catch(NumberFormatException e){
            return 0;
        }
    }
}
