public static Object findFirstMatch(Collection source,Collection candidates){
Iterator iterator=candidates.iterator();
		while(iterator.hasNext()){
			Object candidate=iterator.next();
			if(source.contains(candidate)){
				return candidate;
			}
		}
		return null;
	}