public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
String s=u.getPath();
    if(s==null)return Collections.emptyList();
    int n=s.length();
    List<PathSegmentImpl> ret=new ArrayList<>();
    for(int i=0;i<n;){
        char c=s.charAt(i);
        if(c=='/'){
            ++i;
            continue;
        }
        StringBuilder sb=new StringBuilder();
        while(i<n&&s.charAt(i)!='/')sb.append(s.charAt(i++));
        PathSegmentImpl ps=decode?new PathSegmentImpl(sb.toString(),true):new PathSegmentImpl(sb.toString());
        ret.add(ps);
    }
    return ret;
}