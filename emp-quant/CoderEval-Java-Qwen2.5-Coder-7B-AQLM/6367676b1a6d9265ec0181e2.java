class Generated {
    public static Object findFirstMatch(Collection source,Collection candidates){
    for(Object obj : source){ 
            if(candidates.contains(obj)){ 
                return obj; 
            } 
        } 
        return null; 
    }
}
