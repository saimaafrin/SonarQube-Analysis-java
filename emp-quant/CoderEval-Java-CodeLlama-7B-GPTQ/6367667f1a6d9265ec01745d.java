public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
List<PathSegmentImpl> pathSegments = new ArrayList<PathSegmentImpl>();
	String path = u.getRawPath();
	if(path == null || path.length() == 0){
		return pathSegments;
	}
	int start = 0;
	int end = 0;
	while(end < path.length()){
		if(path.charAt(end) == '/'){
			if(end > start){
				pathSegments.add(new PathSegmentImpl(path.substring(start,end),decode));
			}
			start = end + 1;
		}
		end++;
	}
	if(end > start){
		pathSegments.add(new PathSegmentImpl(path.substring(start,end),decode));
	}
	return pathSegments;
}