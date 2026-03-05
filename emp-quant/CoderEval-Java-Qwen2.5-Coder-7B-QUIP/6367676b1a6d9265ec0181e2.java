class Generated {
    public static Object findFirstMatch(Collection source,Collection candidates){
    for(Object candidate:candidates){  
            if(source.equals(candidate)){  
                return candidate;  
            }  
        }  
        return null;  
    }  
    
    **Returns the first element in candidates that matches the source.**
}
