public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
List<PathSegmentImpl> segments = new ArrayList<PathSegmentImpl>(); 
    String path = u.getPath(); 
    if (path == null) { 
        return segments; 
    } 
    String[] parts = path.split("/"); 
    for (String part : parts) { 
        if (part.isEmpty()) { 
            continue; 
        } 
        PathSegmentImpl segment = new PathSegmentImpl(); 
        if (decode) { 
            segment.setEncodedPathSegment(URIUtils.decode(part, "UTF-8")); 
        } else { 
            segment.setEncodedPathSegment(part); 
        } 
        segments.add(segment); 
    } 
    return segments; 
}