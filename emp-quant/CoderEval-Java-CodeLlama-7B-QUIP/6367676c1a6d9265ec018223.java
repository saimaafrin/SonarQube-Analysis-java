class Generated {
    public static boolean containsInstance(Collection collection,Object element){
    if(collection==null)
    		return false;
    	for(Iterator it=collection.iterator();it.hasNext();){
    		if(it.next()==element)
    			return true;
    	}
    	return false;
    }
}
