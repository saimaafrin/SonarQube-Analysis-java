class Generated {
    private String buildContentRange(){
    if(limit == 0){
            return "Content-Range: " + contentType + " " + offset + " " + count + "/" + count;
        }
        return "Content-Range: " + contentType + " " + offset + " " + limit + "/" + count;
    }
}
