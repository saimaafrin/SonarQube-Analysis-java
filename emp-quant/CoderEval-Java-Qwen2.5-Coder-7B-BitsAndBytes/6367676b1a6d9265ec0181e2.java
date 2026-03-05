class Generated {
    public static Object findFirstMatch(Collection source,Collection candidates){
    Iterator iter = source.iterator();
        while(iter.hasNext()){
            Object obj = iter.next();
            if(candidates.contains(obj)){
                return obj;
            }
        }
        return null;
    }
}
