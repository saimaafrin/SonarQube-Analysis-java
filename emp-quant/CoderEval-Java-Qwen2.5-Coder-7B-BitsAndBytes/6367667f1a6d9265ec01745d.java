class Generated {
    public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
    if(u==null){
            return Collections.emptyList();
        }
        String s=u.getPath();
        if(s==null||s.isEmpty()){
            return Collections.emptyList();
        }
        List<PathSegmentImpl> list=new ArrayList<>();
        int start=0;
        for(int i=1;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='/'){
                PathSegmentImpl ps=decode?decodeSegment(s,start,i):new PathSegmentImpl(s.substring(start,i),false);
                list.add(ps);
                start=i+1;
            }
        }
        if(start<s.length()){
            PathSegmentImpl ps=decode?decodeSegment(s,start,s.length()):new PathSegmentImpl(s.substring(start,s.length()),false);
            list.add(ps);
        }
        return list;
    }
}
