public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
List<PathSegmentImpl> segments=new ArrayList<>();
	String path=u.getPath();
	if(path==null) return segments;
	int start=0;
	int end=path.indexOf('/',start);
	while(end!=-1){
		String segment=path.substring(start,end);
		if(decode){
			try{
				segment=URLDecoder.decode(segment,"UTF-8");
			}catch(UnsupportedEncodingException e){
				throw new RuntimeException(e);
			}
		}
		segments.add(new PathSegmentImpl(segment));
		start=end+1;
		end=path.indexOf('/',start);
	}
	if(start<path.length()){
		String segment=path.substring(start);
		if(decode){
			try{
				segment=URLDecoder.decode(segment,"UTF-8");
			}catch(UnsupportedEncodingException e){
				throw new RuntimeException(e);
			}
		}
		segments.add(new PathSegmentImpl(segment));
	}
	return segments;
}