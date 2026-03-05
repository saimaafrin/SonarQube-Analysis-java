class Generated {
    public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
    if(u==null) return null;
        String s=u.getPath();
        if(s==null||s.length()==0) return Collections.emptyList();
        List<PathSegmentImpl> list=new ArrayList<>();
        int start=0,end=s.indexOf('/',start);
        while(end!=-1){
            PathSegmentImpl ps=new PathSegmentImpl();
            ps.setEncoded(true);
            ps.setValue(s.substring(start,end));
            if(decode){
                try{
                    ps.setValue(URLDecoder.decode(ps.getValue(),StandardCharsets.UTF_8.name()));
                }catch(UnsupportedEncodingException e){}
            }
            list.add(ps);
            start=end+1;
            end=s.indexOf('/',start);
        }
        PathSegmentImpl ps=new PathSegmentImpl();
        ps.setEncoded(true);
        ps.setValue(s.substring(start));
        if(decode){
            try{
                ps.setValue(URLDecoder.decode(ps.getValue(),StandardCharsets.UTF_8.name()));
            }catch(UnsupportedEncodingException e){}
        }
        list.add(ps);
        return list;
    }
}
