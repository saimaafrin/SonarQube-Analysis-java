class Generated {
    public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
    List<PathSegmentImpl> decoded=new ArrayList<>();
        String[] segments=u.getPath().split("/");
        for(String segment:segments){
            if(segment.isEmpty()){
                continue;
            }
            if(decode){
                try{
                    segment=URLDecoder.decode(segment,"UTF-8");
                }catch(UnsupportedEncodingException e){
                    throw new RuntimeException(e);
                }
            }
            decoded.add(new PathSegmentImpl(segment));
        }
        return decoded;
    }
}
