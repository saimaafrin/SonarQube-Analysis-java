class Generated {
    public static boolean containsInstance(Collection collection,Object element){
    if(collection==null)
    		return false;
    	for(Iterator iterator=collection.iterator();iterator.hasNext();){
    		if(iterator.next().equals(element))
    			return true;
    	}
    	return false;
    }
}
