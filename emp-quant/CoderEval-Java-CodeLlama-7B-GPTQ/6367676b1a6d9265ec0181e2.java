class Generated {
    public static Object findFirstMatch(Collection source,Collection candidates){
    Iterator it=candidates.iterator();
    	while(it.hasNext()){
    		Object candidate=it.next();
    		if(source.contains(candidate)){
    			return candidate;
    		}
    	}
    	return null;
    }
}
