class Generated {
    public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
    List<PathSegmentImpl> pathSegments = new ArrayList<PathSegmentImpl>();
        String path = u.getPath();
        if (path == null) {
            return pathSegments;
        }
        String[] segments = path.split("/");
        for (String segment : segments) {
            if (segment.isEmpty()) {
                continue;
            }
            if (decode) {
                segment = URLDecoder.decode(segment, "UTF-8");
            }
            pathSegments.add(new PathSegmentImpl(segment, null));
        }
        return pathSegments;
    }
}
