class Generated {
    public static boolean containsInstance(Collection collection,Object element){
    if(collection==null)
    		return false;
    	for(Object obj:collection)
    		if(obj==element)
    			return true;
    	return false;
    }
}
