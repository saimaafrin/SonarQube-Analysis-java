class Generated {
    private Set<V> intersection(Set<V> set1,Set<V> set2){
    Set<V> intersection = new HashSet<V>();  
        for(V value : set1){  
            if(set2.contains(value)){  
                intersection.add(value);  
            }  
        }  
        return intersection;  
    }  
    
    **Explanation:**
    The `intersection` method takes two `Set<V>` objects as parameters. It initializes a new `HashSet<V>` called `intersection` to store the common elements. It then iterates over the first set (`set1`) and checks if each element is present in the second set (`set2`). If an element is found in both sets, it is added to the `intersection` set. Finally, the method returns the `intersection` set containing all the common elements.
}
