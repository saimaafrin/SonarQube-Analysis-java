class Generated {
    public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
    List<PathSegmentImpl> pathSegments = new ArrayList<PathSegmentImpl>();
    	String path = u.getRawPath();
    	if(path == null || path.length() == 0){
    		return pathSegments;
    	}
    	int start = 0;
    	int end = path.indexOf('/',start);
    	while(end != -1){
    		String segment = path.substring(start,end);
    		if(decode){
    			segment = URLUtils.decode(segment);
    		}
    		pathSegments.add(new PathSegmentImpl(segment));
    		start = end + 1;
    		end = path.indexOf('/',start);
    	}
    	String segment = path.substring(start);
    	if(decode){
    		segment = URLUtils.decode(segment);
    	}
    	pathSegments.add(new PathSegmentImpl(segment));
    	return pathSegments;
    }
}
