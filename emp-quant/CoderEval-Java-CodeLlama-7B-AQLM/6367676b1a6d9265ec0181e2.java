class Generated {
    public static Object findFirstMatch(Collection source,Collection candidates){
    if(source==null||candidates==null)
    		return null;
    	for(Iterator iter=candidates.iterator();iter.hasNext();){
    		Object candidate=iter.next();
    		if(source.contains(candidate))
    			return candidate;
    	}
    	return null;
    }
}
