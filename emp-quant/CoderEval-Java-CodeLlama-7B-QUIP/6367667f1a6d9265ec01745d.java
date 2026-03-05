public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
List<PathSegmentImpl> segments = new ArrayList<PathSegmentImpl>();
    String path = u.getPath();
    if(path.length()==0){
        return segments;
    }
    if(path.charAt(0)=='/'){
        path = path.substring(1);
    }
    String[] parts = path.split("/");
    for(String part : parts){
        if(part.length()==0){
            continue;
        }
        if(part.charAt(0)=='{'){
            part = part.substring(1,part.length()-1);
        }
        if(decode){
            part = URLDecoder.decode(part, "UTF-8");
        }
        segments.add(new PathSegmentImpl(part, part));
    }
    return segments;
}
}