public static Object findFirstMatch(Collection source,Collection candidates){
if(source==null)return null;
	if(candidates==null)return null;
	for(Iterator it=candidates.iterator();it.hasNext();){
		Object candidate=it.next();
		if(source.contains(candidate))return candidate;
	}
	return null;
}