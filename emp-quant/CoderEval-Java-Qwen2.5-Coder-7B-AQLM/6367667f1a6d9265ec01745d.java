class Generated {
    public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
    List<PathSegmentImpl> decodedPath = new ArrayList<PathSegmentImpl>();
        String path = u.getPath();
        if(path == null){
            return decodedPath;
        }
        String[] segments = path.split("/");
        for(String segment : segments){
            if(segment.isEmpty()){
                continue;
            }
            if(decode){
                segment = URLDecoder.decode(segment, "UTF-8");
            }
            decodedPath.add(new PathSegmentImpl(segment));
        }
        return decodedPath;
    }
}
